package au.edu.utas.www.organiserapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;
import java.util.Vector;

public class ViewAllTasks extends AppCompatActivity {

    List<taskObject> allTasks =  new Vector<taskObject>();
    ListView allTasksView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_tasks);



        allTasks = ((GlobalVariables) this.getApplication()).getAllTasks();

        allTasksView = (ListView) findViewById(R.id.AllTasksList);
        taskViewAdapter adapter = new taskViewAdapter(this, android.R.layout.simple_list_item_1,allTasks)  ;
        allTasksView.setAdapter(adapter);
    }

}
