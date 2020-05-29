package com.pawan.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {  // to schedule messages and runnables to be executed at some point in the future
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);  // jumping from one activity to another
                    startActivity(i);
                    finish();
                }
                 }, SPLASH_TIME_OUT);
    }
}
