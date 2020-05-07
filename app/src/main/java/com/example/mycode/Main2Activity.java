package com.example.mycode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        logo log=new logo();
        log.start();
    }
    private class logo extends Thread{
        public void run(){
            try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Intent intent =new Intent(Main2Activity.this,MainActivity.class);
            startActivity(intent);
            Main2Activity.this.finish();
        }
    }
}
