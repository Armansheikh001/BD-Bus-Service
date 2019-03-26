package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Shohagscaina_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shohagscaina_home);

        getSupportActionBar().setTitle("Shohag Scania");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(Shohagscaina_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void destime7(View view) {
        Intent intent = new Intent(Shohagscaina_home.this,Das_Time_Shohag.class);
        startActivity(intent);
    }

    public void amountShohag(View view) {
        Intent intent = new Intent(Shohagscaina_home.this,Amount_Shohag.class);
        startActivity(intent);
    }

    public void choise8(View view) {
        Intent intent = new Intent(Shohagscaina_home.this,Choise_Seat_Shohag.class);
        startActivity(intent);
    }

    public void buyTicket5(View view) {
        Intent intent = new Intent(Shohagscaina_home.this,Buy_Ticket_Shohag.class);
        startActivity(intent);
    }
}
