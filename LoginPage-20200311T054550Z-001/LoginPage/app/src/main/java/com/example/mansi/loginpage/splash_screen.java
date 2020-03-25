package com.example.mansi.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splash_screen extends AppCompatActivity {
    private int sleep_timer=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();



        Logolauncher logolauncher=new Logolauncher();
        logolauncher.start();

    }
    private class Logolauncher extends Thread{
        public void run(){
            try{
                sleep(1000*sleep_timer);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent=new Intent(splash_screen.this,navigation.class);
            startActivity(intent);
            //to destroy activity**********
            splash_screen.this.finish();

        }
    }

}




