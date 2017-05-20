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
import java.util.Calendar;

public class TaskEnterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_enter_screen);
    }

    public void createTask(View view) throws ParseException {

        EditText nameField = (EditText)findViewById(R.id.TaskNameInput);
        EditText descField = (EditText)findViewById(R.id.TaskDescriptionInput);
        EditText dateField = (EditText)findViewById(R.id.TaskDateInput);
        SeekBar importanceBar = (SeekBar) findViewById(R.id.ImportanceInput);

        String name = nameField.getText().toString();
        String description = descField.getText().toString();

        java.util.Date dueDate = new java.util.Date();
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            dueDate = df.parse(dateField.getText().toString());
            Log.d("Date", dueDate.toString());
        }
        catch(ParseException e) {
            e.printStackTrace();
        }

        float urgency = importanceBar.getProgress();

        ((GlobalVariables) this.getApplication()).addNewTask(name, description, dueDate, urgency);
        startActivity(new Intent(TaskEnterScreen.this, MainActivity.class));
    }
}
