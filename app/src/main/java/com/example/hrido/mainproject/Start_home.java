package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_home);
    }

    public void startclick(View view) {
        Intent intent=new Intent(Start_home.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
