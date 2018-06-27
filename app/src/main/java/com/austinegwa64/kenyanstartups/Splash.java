package com.austinegwa64.kenyanstartups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread loadHomeActivityThread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent loadHomeActivity = new Intent(getApplicationContext(), Home.class);
                    startActivity(loadHomeActivity);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        loadHomeActivityThread.start();
    }
}
