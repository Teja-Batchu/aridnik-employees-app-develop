package com.aridnik.employee;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aridnik.employee.activities.Login;
import com.aridnik.employee.utils.AppSignatureHelper;

public class Splash extends AppCompatActivity {

    private int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new AppSignatureHelper(Splash.this);

        handleRedirections();
    }




    private void handleRedirections(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, Login.class));
            }
        },SPLASH_TIME_OUT);
    }
}
