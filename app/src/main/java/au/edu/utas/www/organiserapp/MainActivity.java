package au.edu.utas.www.organiserapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector ;
//import java.util.Collection;



public class MainActivity extends AppCompatActivity {

    ListView todaysComms;

    List<taskObject> myList = new ArrayList<taskObject>(); // list of tasks







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button)findViewById(R.id.TMQButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TMQ.class));
            }
        });
        

        taskObject newTask0 = new taskObject();

        newTask0.name = "a";
        newTask0.description = "assignment0";

        taskObject newtask1 = new taskObject();

        newtask1.name = "b";
        newtask1.description = "assignment1";

        taskObject newTask2 = new taskObject();

        newTask2.name = "c";
        newTask2.description = "assignment2";



       // newTask.dueDate = new Date(2017,05,02);

        myList.add(newTask0);
        myList.add(newtask1);
        myList.add(newTask2);

       // for (int i = 0; i < 3; i++){

      //  Log.d("test",myList.get(i).name);
      //  Log.d("test",myList.get(i).description);
      //  }
        
        
        
        
        
        todaysComms = (ListView) findViewById(R.id.TodayCommitmentsList);
                
         taskViewAdapter adapter = new taskViewAdapter(this, android.R.layout.simple_list_item_1,myList)  ;
         todaysComms.setAdapter(adapter);
                
                
                
    }
}

class taskObject {


    String name;
    String description;
    //java.util.Date dueDate;

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