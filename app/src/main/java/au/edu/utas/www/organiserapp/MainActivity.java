package au.edu.utas.www.organiserapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    ListView todaysComms;

    List<taskObject> todayList = new Vector<taskObject>(); //Local list for today's variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tmqBtn = (Button)findViewById(R.id.TMQButton);

        ((GlobalVariables) this.getApplication()).getAllTasks();
        
        tmqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TMQ.class));
            }
        });

        Button allTaskBtn = (Button)findViewById(R.id.ViewAllTasksButton);

        allTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewAllTasks.class));
            }
        });



        Button addScreenBtn = (Button)findViewById(R.id.AddAppointmentButton);

        addScreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TaskEnterScreen.class));
            }
        });


        // Create a calendar object that will convert the date and time value in milliseconds to date.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        ((GlobalVariables) this.getApplication()).getAllTasks();
        todayList = ((GlobalVariables) this.getApplication()).getTasksBeforeDate(calendar.getTime());
        todaysComms = (ListView) findViewById(R.id.TodayCommitmentsList);
        taskViewAdapter adapter = new taskViewAdapter(this, android.R.layout.simple_list_item_1,todayList)  ;
        todaysComms.setAdapter(adapter);
        AdapterView.OnItemClickListener todayCommsListner = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Commitments view", "You clicked Item: " + todayList.get((int)id).name + " at position:" + position);
                Intent openTask = new Intent(MainActivity.this, EditTask.class);
                openTask.putExtra("Selected", todayList.get((int)id).getID());
                startActivity(openTask);
            }
        };
        todaysComms.setOnItemClickListener(todayCommsListner);

        final List<taskObject> priorityList = ((GlobalVariables) this.getApplication()).getTasksByPriority(2);
        ListView priorityView = (ListView) findViewById(R.id.UpcomingDeadlinesList);
        taskViewAdapter priorityAdaptor = new taskViewAdapter(this, android.R.layout.simple_list_item_1,priorityList)  ;
        priorityView.setAdapter(priorityAdaptor);
        AdapterView.OnItemClickListener priorityListner = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Commitments view", "You clicked Item: " + priorityList.get((int)id).name + " at position:" + position);
                Intent openTask = new Intent(MainActivity.this, EditTask.class);
                openTask.putExtra("Selected", priorityList.get((int)id).getID());
                startActivity(openTask);
            }
        };
        priorityView.setOnItemClickListener(priorityListner);

        TextView TMQScore = (TextView) findViewById(R.id.TMQScore);
        TMQScore.setText("TMQ SCORE: " + ((GlobalVariables) this.getApplication()).getScore("TMQScore", this));
    }


}



class taskViewAdapter extends ArrayAdapter<taskObject>
{
    Context mContext;
    int layoutResourceID;
    List<taskObject> data = null;
    
    public taskViewAdapter(Context mContext, int layoutResourceID, List<taskObject> data){
        super(mContext, layoutResourceID,data);
        this.layoutResourceID = layoutResourceID;
        this.mContext = mContext;
        this.data = data;
    }
}