package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class purbasha_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purbasha_home);

        getSupportActionBar().setTitle("Purbasha");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void backbtn(View view) {
        Intent intent = new Intent(purbasha_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void destime3(View view) {
        Intent intent = new Intent(purbasha_home.this,Das_Time_purbasha.class);
        startActivity(intent);
    }

    public void amountPurbasha(View view) {
        Intent intent = new Intent(purbasha_home.this,Amount_Purbasha.class);
        startActivity(intent);
    }

    public void choise6(View view) {
        Intent intent = new Intent(purbasha_home.this,Choise_Seat_Purbasha.class);
        startActivity(intent);
    }

    public void buyticket7(View view) {
        Intent intent = new Intent(purbasha_home.this,Buy_Ticket_Purbasha.class);
        startActivity(intent);
    }
}
