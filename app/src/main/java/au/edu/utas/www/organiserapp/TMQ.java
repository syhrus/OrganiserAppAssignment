package au.edu.utas.www.organiserapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TMQ  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmq);


        Button TmqCompleteBtn = (Button) findViewById(R.id.buttonTmq);

        TmqCompleteBtn.setOnClickListener (new View.OnClickListener()

        {

            @Override
            public void onClick (View v){
                getScore();
            }
        });
    }






    public void getScore(){

        Toast.makeText(TMQ.this, "function called Successfully", Toast.LENGTH_SHORT).show();
    }
}

