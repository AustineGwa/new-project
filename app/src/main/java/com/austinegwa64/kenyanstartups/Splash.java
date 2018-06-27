package com.austinegwa64.kenyanstartups;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View decorView = getWindow().getDecorView();

        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_splash);

        Thread loadHomeActivityThread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent loadHomeActivity = new Intent(getApplicationContext(), Home.class);
                    startActivity(loadHomeActivity);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        loadHomeActivityThread.start();

    }
}
