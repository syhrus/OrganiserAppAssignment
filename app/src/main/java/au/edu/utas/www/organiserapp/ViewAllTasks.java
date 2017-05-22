package au.edu.utas.www.organiserapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;
import java.util.Vector;

public class ViewAllTasks extends AppCompatActivity {

    List<taskObject> allTasks =  new Vector<taskObject>();
    List<taskObject> impurgTasks =  new Vector<taskObject>();//important & urgent tasks
    List<taskObject> impunurgTasks =  new Vector<taskObject>();//important & un-urgent tasks
    List<taskObject> unimpurgTasks =  new Vector<taskObject>();//unimportant & urgent tasks
    List<taskObject> unimpunurgTasks =  new Vector<taskObject>();//unimportant & un-urgent tasks
    ListView allTasksView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_tasks);

        //Get all tasks list
        allTasks = ((GlobalVariables) this.getApplication()).getAllTasks();
        //Make filtered list
        impurgTasks = ((GlobalVariables) this.getApplication()).filterTasksImportanceGreaterThan(allTasks, 50);
        //Make use of already filtered list to save processing time on next filter layer.
        impunurgTasks = ((GlobalVariables) this.getApplication()).filterTasksDaysGreaterThan(impurgTasks, 7);
        impurgTasks = ((GlobalVariables) this.getApplication()).filterTasksDaysLessThan(impurgTasks, 8);
        //Make filtered list
        unimpurgTasks = ((GlobalVariables) this.getApplication()).filterTasksImportanceLessThan(allTasks, 51);
        //Make use of already filtered list to save processing time on next filter layer.
        unimpunurgTasks = ((GlobalVariables) this.getApplication()).filterTasksDaysGreaterThan(unimpurgTasks, 7);
        unimpurgTasks = ((GlobalVariables) this.getApplication()).filterTasksDaysLessThan(unimpurgTasks, 8);

        allTasksView = (ListView) findViewById(R.id.AllTasksList);

        taskViewAdapter allAdapter = new taskViewAdapter(this, android.R.layout.simple_list_item_1,allTasks);

        allTasksView.setAdapter(allAdapter);


        AdapterView.OnItemClickListener listner = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Commitments view", "You clicked Item: " + allTasks.get((int)id).name + " at position:" + position);
                Intent openTask = new Intent(ViewAllTasks.this, EditTask.class);
                openTask.putExtra("Selected", allTasks.get((int)id).getID());
                startActivity(openTask);
            }
        };
        allTasksView.setOnItemClickListener(listner);

        RadioGroup rGroup = (RadioGroup)findViewById(R.id.sortGroup);

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId) {
                    case R.id.Sort1:
                        setNewAdapter(allTasksView,allTasks);
                        break;
                    case R.id.Sort2:
                        setNewAdapter(allTasksView, impurgTasks);
                        break;
                    case R.id.Sort3:
                        setNewAdapter(allTasksView, unimpurgTasks);
                        break;
                    case R.id.Sort4:
                        setNewAdapter(allTasksView, impunurgTasks);
                        break;
                    case R.id.Sort5:
                        setNewAdapter(allTasksView, unimpunurgTasks);
                        break;
                    default:
                        setNewAdapter(allTasksView, allTasks);
                        break;
                }
            }
        });
    }

    void setNewAdapter(ListView view, List<taskObject> list){
        taskViewAdapter newAdapter = new taskViewAdapter(this, android.R.layout.simple_list_item_1,list);
        view.setAdapter(newAdapter);
    }
}
