package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Southline_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southline_home);

        getSupportActionBar().setTitle("South Line");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void backbtn1(View view) {
        Intent intent = new Intent(Southline_home.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    public void destime(View view) {
        Intent intent = new Intent(Southline_home.this,Des_time_South.class);
        startActivity(intent);

    }

    public void amountSouth(View view) {
        Intent intent = new Intent(Southline_home.this,Amount_South.class);
        startActivity(intent);
    }

    public void choise9(View view) {
        Intent intent = new Intent(Southline_home.this,Choise_Seat_Southline.class);
        startActivity(intent);
    }

    public void buyticket9(View view) {
        Intent intent = new Intent(Southline_home.this,Buy_Ticket_South.class);
        startActivity(intent);
    }
}
