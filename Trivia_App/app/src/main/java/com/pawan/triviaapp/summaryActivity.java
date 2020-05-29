package com.pawan.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class summaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();
        String message = i.getStringExtra("greetings");
        ((EditText)findViewById(R.id.editText2)).setText("Hello" + message);
        ((EditText)findViewById(R.id.editText2)).append(System.getProperty("line.separator"));
        ((EditText)findViewById(R.id.editText2)).setText("Here are the answers selected:");
        ((EditText)findViewById(R.id.editText2)).append(System.getProperty("line.separator"));
        ((EditText)findViewById(R.id.editText2)).setText("Who is the best cricketer in the world?");
        String first = i.getStringExtra("first");
        ((EditText)findViewById(R.id.editText2)).setText(first);
        ((EditText)findViewById(R.id.editText2)).append(System.getProperty("line.separator"));
        ((EditText)findViewById(R.id.editText2)).setText("What are the colors in the national flag?");









    }
}
