package com.aridnik.employee.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aridnik.employee.R;
import com.aridnik.employee.utils.AppUtils;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private TextView versionName;
    Button login_btn;

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
        login_btn = findViewById(R.id.login_btn);

        login_btn.setOnClickListener(this);
    }


    public void bindData(){
        versionName.setText(AppUtils.getAppVersion().equalsIgnoreCase("") ? "Version 1.0b":AppUtils.getAppVersion());
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.login_btn:

                startActivity(new Intent(Login.this, OTPVerification.class));
                break;

                default:
                    break;
        }
    }
}
