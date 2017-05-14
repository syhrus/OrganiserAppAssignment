package au.edu.utas.www.organiserapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

public class TaskEnterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_enter_screen);
    }

    public void createTask(View view){

        EditText nameField = (EditText)findViewById(R.id.TaskNameInput);
        EditText descField = (EditText)findViewById(R.id.TaskDescriptionInput);
        EditText dateField = (EditText)findViewById(R.id.TaskDateInput);
        SeekBar importanceBar = (SeekBar) findViewById(R.id.ImportanceInput);

        String name = nameField.getText().toString();
        String description = descField.getText().toString();
        //TODO: Work out how to get the date correctly.
        java.util.Date dueDate = new java.util.Date();
        float urgency = importanceBar.getProgress();

        ((GlobalVariables) this.getApplication()).addNewTask(name, description, dueDate, urgency);
        startActivity(new Intent(TaskEnterScreen.this, MainActivity.class));
    }
}
