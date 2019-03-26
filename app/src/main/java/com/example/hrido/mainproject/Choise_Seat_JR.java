package com.example.hrido.mainproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Choise_Seat_JR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise__seat__jr);

        getSupportActionBar().setTitle("Choice Your Seat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
