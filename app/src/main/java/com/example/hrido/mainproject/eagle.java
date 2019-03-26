package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class eagle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eagle);

        getSupportActionBar().setTitle("Eagle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(eagle.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void destime4(View view) {
        Intent intent = new Intent(eagle.this,Das_time_Eagle.class);
        startActivity(intent);
    }

    public void amountEagle(View view) {
        Intent intent = new Intent(eagle.this,Amount_Eagle.class);
        startActivity(intent);
    }

    public void choise1(View view) {
        Intent intent = new Intent(eagle.this,Choise_Seat_Eg.class);
        startActivity(intent);
    }

    public void buyTicket(View view) {
        Intent intent = new Intent(eagle.this,Buy_Ticket_Eagle.class);
        startActivity(intent);
    }
}
