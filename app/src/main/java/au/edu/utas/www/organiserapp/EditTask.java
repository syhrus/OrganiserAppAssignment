package au.edu.utas.www.organiserapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static au.edu.utas.www.organiserapp.R.id.textView;

public class EditTask extends AppCompatActivity {
    taskObject thisTask;
    EditText titleText;
    EditText descText;
    EditText dateText;
    SeekBar importance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);
        Bundle extras = getIntent().getExtras();
        int taskID = extras.getInt("Selected");
        thisTask = ((GlobalVariables) this.getApplication()).getTaskByID(taskID);
        if(thisTask != null) {
            titleText = (EditText) findViewById(R.id.TaskNameInput);
            titleText.setText(thisTask.name);
            descText = (EditText) findViewById(R.id.TaskDescriptionInput);
            descText.setText(thisTask.description);
            dateText = (EditText) findViewById(R.id.TaskDateInput);
            dateText.setText("" + thisTask.dueDate.getDate() + "/" + (thisTask.dueDate.getMonth() + 1) + "/" + (thisTask.dueDate.getYear() + 1900));
            importance = (SeekBar) findViewById(R.id.ImportanceInput);
            importance.setProgress((int) thisTask.urgency);
        }
    }

    public void saveChanges(View view) {
        java.util.Date dueDate = thisTask.dueDate;
        EditText dateField = (EditText) findViewById(R.id.TaskDateInput);
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            dueDate = df.parse(dateField.getText().toString());
            Log.d("Date", dueDate.toString());
        }
        catch(ParseException e) {
            e.printStackTrace();
        }
        thisTask.changeTask(titleText.getText().toString(), descText.getText().toString(), dueDate, importance.getProgress());
        ((GlobalVariables) this.getApplication()).completeTask(thisTask);
        ((GlobalVariables) this.getApplication()).addNewTask(thisTask.name, thisTask.description, thisTask.dueDate, thisTask.urgency);

        startActivity(new Intent(EditTask.this, MainActivity.class));
    }
    public void discardChanges(View view) {
        startActivity(new Intent(EditTask.this, MainActivity.class));
    }
    public void completeTask(View view) {
        ((GlobalVariables) this.getApplication()).completeTask(thisTask);
        startActivity(new Intent(EditTask.this, MainActivity.class));
    }
}
