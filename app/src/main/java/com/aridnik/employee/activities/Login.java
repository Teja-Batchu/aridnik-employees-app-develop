package com.aridnik.employee.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aridnik.employee.R;
import com.aridnik.employee.utils.AppUtils;

public class Login extends AppCompatActivity {

    private TextView versionName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    protected void onStart() {
        super.onStart();
        initViews();
        bindData();
    }



    public void initViews(){
        versionName = findViewById(R.id.loginVersionTxt);
    }


    public void bindData(){
        versionName.setText(AppUtils.getAppVersion().equalsIgnoreCase("") ? "Version 1.0b":AppUtils.getAppVersion());
    }






}
