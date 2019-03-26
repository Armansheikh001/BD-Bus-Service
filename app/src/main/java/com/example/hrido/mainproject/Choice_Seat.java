package com.example.hrido.mainproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Choice_Seat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice__seat);

        getSupportActionBar().setTitle("Choice Your Seat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
