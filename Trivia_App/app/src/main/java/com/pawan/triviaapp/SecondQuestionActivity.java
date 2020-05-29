package com.pawan.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.CheckBox;

public class SecondQuestionActivity extends AppCompatActivity {

    CheckBox White, Yellow, Orange, Green;
    Button bNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        White = (CheckBox)findViewById(R.id.checkBox);
        Yellow = (CheckBox)findViewById(R.id.checkBox2);
        Orange = (CheckBox)findViewById(R.id.checkBox3);
        Green = (CheckBox)findViewById(R.id.checkBox4);
        bNext = (Button)findViewById(R.id.button);


        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (White.isChecked() == true || Yellow.isChecked() == true || Orange.isChecked() == true || Green.isChecked() == true){
                    Intent i =new Intent(SecondQuestionActivity.this,summaryActivity.class);
                    boolean checked = ((CheckBox) view).isChecked();

                    // Check which checkbox was clicked
                  /*  switch(view.getId()) {
                        case R.id.checkBox:
                            if (checked)
                                i.putExtra("White",checkBox);
                           // break;
                        case R.id.checkBox2:
                            if (checked)

                               // break;
                        case R.id.checkBox3:
                            if (checked)

                               // break;
                        case R.id.checkBox4:
                            if (checked)

                               // break;
                    }*/

                    startActivity(i);

                }else {
                    Toast.makeText(SecondQuestionActivity.this,"Select any one option",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
