package au.edu.utas.www.organiserapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class TMQ  extends AppCompatActivity {

    RadioButton b1;
    RadioButton b2;
    RadioButton b3;
    RadioButton b4;
    RadioButton b5;
    RadioButton b6;
    RadioButton b7;
    RadioButton b8;
    RadioButton b9;
    RadioButton b10;
    RadioButton b11;
    RadioButton b12;
    RadioButton b13;
    RadioButton b14;
    RadioButton b15;
    RadioButton b16;
    RadioButton b17;
    RadioButton b18;
    RadioButton b19;
    RadioButton b20;
    RadioButton b21;
    RadioButton b22;
    RadioButton b23;
    RadioButton b24;
    RadioButton b25;
    RadioButton b26;
    RadioButton b27;
    RadioButton b28;
    RadioButton b29;
    RadioButton b30;
    RadioButton b31;
    RadioButton b32;
    RadioButton b33;
    RadioButton b34;
    RadioButton b35;
    RadioButton b36;
    RadioButton b37;
    RadioButton b38;
    RadioButton b39;
    RadioButton b40;
    RadioButton b41;
    RadioButton b42;
    RadioButton b43;
    RadioButton b44;
    RadioButton b45;
    RadioButton b46;
    RadioButton b47;
    RadioButton b48;
    RadioButton b49;
    RadioButton b50;
    RadioButton b51;
    RadioButton b52;
    RadioButton b53;
    RadioButton b54;
    RadioButton b55;
    RadioButton b56;
    RadioButton b57;
    RadioButton b58;
    RadioButton b59;
    RadioButton b60;
    RadioButton b61;
    RadioButton b62;
    RadioButton b63;
    RadioButton b64;
    RadioButton b65;
    RadioButton b66;
    RadioButton b67;
    RadioButton b68;
    RadioButton b69;
    RadioButton b70;
    RadioButton b71;
    RadioButton b72;
    RadioButton b73;
    RadioButton b74;
    RadioButton b75;
    RadioButton b76;
    RadioButton b77;
    RadioButton b78;
    RadioButton b79;
    RadioButton b80;
    RadioButton b81;
    RadioButton b82;
    RadioButton b83;
    RadioButton b84;
    RadioButton b85;
    RadioButton b86;
    RadioButton b87;
    RadioButton b88;
    RadioButton b89;
    RadioButton b90;


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

        int score = 0;

        b1 = (RadioButton)findViewById(R.id.radioButton1);
        b2 = (RadioButton)findViewById(R.id.radioButton2);
        b3 = (RadioButton)findViewById(R.id.radioButton3);
        b4 = (RadioButton)findViewById(R.id.radioButton4);
        b5 = (RadioButton)findViewById(R.id.radioButton5);
        b6 = (RadioButton)findViewById(R.id.radioButton6);
        b7 = (RadioButton)findViewById(R.id.radioButton7);
        b8 = (RadioButton)findViewById(R.id.radioButton8);
        b9 = (RadioButton)findViewById(R.id.radioButton9);
        b10 = (RadioButton)findViewById(R.id.radioButton10);
        b11 = (RadioButton)findViewById(R.id.radioButton11);
        b12 = (RadioButton)findViewById(R.id.radioButton12);
        b13 = (RadioButton)findViewById(R.id.radioButton13);
        b14 = (RadioButton)findViewById(R.id.radioButton14);
        b15 = (RadioButton)findViewById(R.id.radioButton15);
        b16 = (RadioButton)findViewById(R.id.radioButton16);
        b17 = (RadioButton)findViewById(R.id.radioButton17);
        b18 = (RadioButton)findViewById(R.id.radioButton18);
        b19 = (RadioButton)findViewById(R.id.radioButton19);
        b20 = (RadioButton)findViewById(R.id.radioButton20);
        b21 = (RadioButton)findViewById(R.id.radioButton21);
        b22 = (RadioButton)findViewById(R.id.radioButton22);
        b23 = (RadioButton)findViewById(R.id.radioButton23);
        b24 = (RadioButton)findViewById(R.id.radioButton24);
        b25 = (RadioButton)findViewById(R.id.radioButton25);
        b26 = (RadioButton)findViewById(R.id.radioButton26);
        b27 = (RadioButton)findViewById(R.id.radioButton27);
        b28 = (RadioButton)findViewById(R.id.radioButton28);
        b29 = (RadioButton)findViewById(R.id.radioButton29);
        b30 = (RadioButton)findViewById(R.id.radioButton30);
        b31 = (RadioButton)findViewById(R.id.radioButton31);
        b32 = (RadioButton)findViewById(R.id.radioButton32);
        b33 = (RadioButton)findViewById(R.id.radioButton33);
        b34 = (RadioButton)findViewById(R.id.radioButton34);
        b35 = (RadioButton)findViewById(R.id.radioButton35);
        b36 = (RadioButton)findViewById(R.id.radioButton36);
        b37 = (RadioButton)findViewById(R.id.radioButton37);
        b38 = (RadioButton)findViewById(R.id.radioButton38);
        b39 = (RadioButton)findViewById(R.id.radioButton39);
        b40 = (RadioButton)findViewById(R.id.radioButton40);
        b41 = (RadioButton)findViewById(R.id.radioButton41);
        b42 = (RadioButton)findViewById(R.id.radioButton42);
        b43 = (RadioButton)findViewById(R.id.radioButton43);
        b44 = (RadioButton)findViewById(R.id.radioButton44);
        b45 = (RadioButton)findViewById(R.id.radioButton45);
        b46 = (RadioButton)findViewById(R.id.radioButton46);
        b47 = (RadioButton)findViewById(R.id.radioButton47);
        b48 = (RadioButton)findViewById(R.id.radioButton48);
        b49 = (RadioButton)findViewById(R.id.radioButton49);
        b50 = (RadioButton)findViewById(R.id.radioButton50);
        b51 = (RadioButton)findViewById(R.id.radioButton51);
        b52 = (RadioButton)findViewById(R.id.radioButton52);
        b53 = (RadioButton)findViewById(R.id.radioButton53);
        b54 = (RadioButton)findViewById(R.id.radioButton54);
        b55 = (RadioButton)findViewById(R.id.radioButton55);
        b56 = (RadioButton)findViewById(R.id.radioButton56);
        b57 = (RadioButton)findViewById(R.id.radioButton57);
        b58 = (RadioButton)findViewById(R.id.radioButton58);
        b59 = (RadioButton)findViewById(R.id.radioButton59);
        b60 = (RadioButton)findViewById(R.id.radioButton60);
        b61 = (RadioButton)findViewById(R.id.radioButton61);
        b62 = (RadioButton)findViewById(R.id.radioButton62);
        b63 = (RadioButton)findViewById(R.id.radioButton63);
        b64 = (RadioButton)findViewById(R.id.radioButton64);
        b65 = (RadioButton)findViewById(R.id.radioButton65);
        b66 = (RadioButton)findViewById(R.id.radioButton66);
        b67 = (RadioButton)findViewById(R.id.radioButton67);
        b68 = (RadioButton)findViewById(R.id.radioButton68);
        b69 = (RadioButton)findViewById(R.id.radioButton69);
        b70 = (RadioButton)findViewById(R.id.radioButton70);
        b71 = (RadioButton)findViewById(R.id.radioButton71);
        b72 = (RadioButton)findViewById(R.id.radioButton72);
        b73 = (RadioButton)findViewById(R.id.radioButton73);
        b74 = (RadioButton)findViewById(R.id.radioButton74);
        b75 = (RadioButton)findViewById(R.id.radioButton75);
        b76 = (RadioButton)findViewById(R.id.radioButton76);
        b77 = (RadioButton)findViewById(R.id.radioButton77);
        b78 = (RadioButton)findViewById(R.id.radioButton78);
        b79 = (RadioButton)findViewById(R.id.radioButton79);
        b80 = (RadioButton)findViewById(R.id.radioButton80);
        b81 = (RadioButton)findViewById(R.id.radioButton81);
        b82 = (RadioButton)findViewById(R.id.radioButton82);
        b83 = (RadioButton)findViewById(R.id.radioButton83);
        b84 = (RadioButton)findViewById(R.id.radioButton84);
        b85 = (RadioButton)findViewById(R.id.radioButton85);
        b86 = (RadioButton)findViewById(R.id.radioButton86);
        b87 = (RadioButton)findViewById(R.id.radioButton87);
        b88 = (RadioButton)findViewById(R.id.radioButton88);
        b89 = (RadioButton)findViewById(R.id.radioButton89);
        b90 = (RadioButton)findViewById(R.id.radioButton90);


// question 1
        if( b1.isChecked()){


            score = score + 1;
        }
        if( b2.isChecked()){


            score = score + 2;
        }
        if( b3.isChecked()){


            score = score + 3;
        }
        if( b4.isChecked()){


            score = score + 4;
        }
        if( b5.isChecked()){


            score = score + 5;
        }

        // question 2
        if( b6.isChecked()){


            score = score + 1;
        }
        if( b7.isChecked()){


            score = score + 2;
        }
        if( b8.isChecked()){


            score = score + 3;
        }
        if( b9.isChecked()){


            score = score + 4;
        }
        if( b10.isChecked()){


            score = score + 5;
        }

        // question 3
        if( b11.isChecked()){


            score = score + 1;
        }
        if( b12.isChecked()){


            score = score + 2;
        }
        if( b13.isChecked()){


            score = score + 3;
        }
        if( b14.isChecked()){


            score = score + 4;
        }
        if( b15.isChecked()){


            score = score + 5;
        }

        // question 4
        if( b16.isChecked()){


            score = score + 1;
        }
        if( b17.isChecked()){


            score = score + 2;
        }
        if( b18.isChecked()){


            score = score + 3;
        }
        if( b19.isChecked()){


            score = score + 4;
        }
        if( b20.isChecked()){


            score = score + 5;
        }

        // question 5
        if( b21.isChecked()){


            score = score + 1;
        }
        if( b22.isChecked()){


            score = score + 2;
        }
        if( b23.isChecked()){


            score = score + 3;
        }
        if( b24.isChecked()){


            score = score + 4;
        }
        if( b25.isChecked()){


            score = score + 5;
        }

        // question 6
        if( b26.isChecked()){


            score = score + 1;
        }
        if( b27.isChecked()){


            score = score + 2;
        }
        if( b28.isChecked()){


            score = score + 3;
        }
        if( b29.isChecked()){


            score = score + 4;
        }
        if( b30.isChecked()){


            score = score + 5;
        }

        // question 7
        if( b31.isChecked()){


            score = score + 1;
        }
        if( b32.isChecked()){


            score = score + 2;
        }
        if( b33.isChecked()){


            score = score + 3;
        }
        if( b34.isChecked()){


            score = score + 4;
        }
        if( b35.isChecked()){


            score = score + 5;
        }


        // question 8
        if( b36.isChecked()){


            score = score + 5;
        }
        if( b37.isChecked()){


            score = score + 4;
        }
        if( b38.isChecked()){


            score = score + 3;
        }
        if( b39.isChecked()){


            score = score + 2;
        }
        if( b40.isChecked()){


            score = score + 1;
        }

        // question 9
        if( b41.isChecked()){


            score = score + 1;
        }
        if( b42.isChecked()){


            score = score + 2;
        }
        if( b43.isChecked()){


            score = score + 3;
        }
        if( b44.isChecked()){


            score = score + 4;
        }
        if( b45.isChecked()){


            score = score + 5;
        }

        // question 10
        if( b46.isChecked()){


            score = score + 5;
        }
        if( b47.isChecked()){


            score = score + 4;
        }
        if( b48.isChecked()){


            score = score + 3;
        }
        if( b49.isChecked()){


            score = score + 2;
        }
        if( b50.isChecked()){


            score = score + 1;
        }

        // question 11
        if( b51.isChecked()){


            score = score + 5;
        }
        if( b52.isChecked()){


            score = score + 4;
        }
        if( b53.isChecked()){


            score = score + 3;
        }
        if( b54.isChecked()){


            score = score + 2;
        }
        if( b55.isChecked()){


            score = score + 1;
        }

        // question 12
        if( b56.isChecked()){


            score = score + 1;
        }
        if( b57.isChecked()){


            score = score + 2;
        }
        if( b58.isChecked()){


            score = score + 3;
        }
        if( b59.isChecked()){


            score = score + 4;
        }
        if( b60.isChecked()){


            score = score + 5;
        }

        // question 13
        if( b61.isChecked()){


            score = score + 5;
        }
        if( b62.isChecked()){


            score = score + 4;
        }
        if( b63.isChecked()){


            score = score + 3;
        }
        if( b64.isChecked()){


            score = score + 2;
        }
        if( b65.isChecked()){


            score = score + 1;
        }

        // question 14
        if( b66.isChecked()){


            score = score + 1;
        }
        if( b67.isChecked()){


            score = score + 2;
        }
        if( b68.isChecked()){


            score = score + 3;
        }
        if( b69.isChecked()){


            score = score + 4;
        }
        if( b70.isChecked()){


            score = score + 5;
        }

        // question 15
        if( b71.isChecked()){


            score = score + 1;
        }
        if( b72.isChecked()){


            score = score + 2;
        }
        if( b73.isChecked()){


            score = score + 3;
        }
        if( b74.isChecked()){


            score = score + 4;
        }
        if( b75.isChecked()){


            score = score + 5;
        }

        // question 16
        if( b76.isChecked()){


            score = score + 5;
        }
        if( b77.isChecked()){


            score = score + 4;
        }
        if( b78.isChecked()){


            score = score + 3;
        }
        if( b79.isChecked()){


            score = score + 2;
        }
        if( b80.isChecked()){


            score = score + 1;
        }


        // question 17
        if( b81.isChecked()){


            score = score + 1;
        }
        if( b82.isChecked()){


            score = score + 2;
        }
        if( b83.isChecked()){


            score = score + 3;
        }
        if( b84.isChecked()){


            score = score + 4;
        }
        if( b85.isChecked()){


            score = score + 5;
        }

        // question 18
        if( b86.isChecked()){


            score = score + 1;
        }
        if( b87.isChecked()){


            score = score + 2;
        }
        if( b88.isChecked()){


            score = score + 3;
        }
        if( b89.isChecked()){


            score = score + 4;
        }
        if( b90.isChecked()){


            score = score + 5;
        }

        Toast.makeText(TMQ.this, "Your score is " + score + " out of 90", Toast.LENGTH_SHORT).show();
        Toast.makeText(TMQ.this, "The average score recorded for Third Year ICT Students is 55 ", Toast.LENGTH_SHORT).show();

          ((GlobalVariables) this.getApplication()).setScore(score, "TMQScore", this);



    }
}

