package com.pawan.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_username;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_username = (EditText)findViewById(R.id.et_username);
        login = (Button)findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= et_username.getText().toString();
                if (username.equalsIgnoreCase("")){
                    Toast.makeText(MainActivity.this,"Plz Enter UserName",Toast.LENGTH_SHORT).show();
                }else {
                    Intent i =new Intent(MainActivity.this,FirstQuestionActivity.class);
                    i.putExtra("greetings",username);
                    startActivity(i);

                }
            }
        });

    }
}
