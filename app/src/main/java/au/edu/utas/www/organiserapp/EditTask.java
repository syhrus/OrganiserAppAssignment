package au.edu.utas.www.organiserapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

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
            //TODO: Add pickup for date
            importance = (SeekBar) findViewById(R.id.ImportanceInput);
            importance.setProgress((int) thisTask.urgency);
        }
    }

    public void saveChanges(View view) {
        thisTask.changeTask(titleText.getText().toString(), descText.getText().toString(), new java.util.Date(), importance.getProgress());
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
