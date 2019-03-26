package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jr_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jr_home);

        getSupportActionBar().setTitle("J.R");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(Jr_home.this,MainActivity.class);
        startActivity(intent);
        finish();
        }

    public void destime8(View view) {
        Intent intent = new Intent(Jr_home.this,Des_Time_JR.class);
        startActivity(intent);

    }

    public void amountJR(View view) {
        Intent intent = new Intent(Jr_home.this,Amount_Jr.class);
        startActivity(intent);
    }


    public void choise3(View view) {
        Intent intent = new Intent(Jr_home.this,Choise_Seat_JR.class);
        startActivity(intent);
    }

    public void buyTicket2(View view) {
        Intent intent = new Intent(Jr_home.this,Buy_Ticket_Jr.class);
        startActivity(intent);
    }
}
