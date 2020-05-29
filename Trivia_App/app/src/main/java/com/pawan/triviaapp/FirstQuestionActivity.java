package com.pawan.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstQuestionActivity extends AppCompatActivity {

    Button btna,btnb,btnc,btnd,btnNext;
    String answer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
        btna = (Button)findViewById(R.id.btnA);
        btnb = (Button)findViewById(R.id.btnB);
        btnc = (Button)findViewById(R.id.btnC);
        btnd = (Button)findViewById(R.id.btnD);
        btnNext = (Button)findViewById(R.id.btnNext);

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=btna.getText().toString();
            }
        });
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=btnb.getText().toString();
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=btnc.getText().toString();
            }
        });
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer=btnd.getText().toString();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer.equalsIgnoreCase("")){
                    Toast.makeText(FirstQuestionActivity.this,"Select any one option",Toast.LENGTH_SHORT).show();
                }else {
                    Intent i =new Intent(FirstQuestionActivity.this,SecondQuestionActivity.class);
                    i.putExtra("first",answer);
                    startActivity(i);
                }
            }
        });
    }
}
