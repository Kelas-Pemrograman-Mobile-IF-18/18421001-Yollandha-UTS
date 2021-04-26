package com.yolla.apkbus.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.yolla.apkbus.R;
import com.yolla.apkbus.admin.HomeAdminActivity;

public class RegisActivity extends AppCompatActivity {

    Button btnLogin;
    NoboButton btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        getSupportActionBar().hide();

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegis = (NoboButton) findViewById(R.id.RegisBtn);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}