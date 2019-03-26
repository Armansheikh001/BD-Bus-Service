package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hanif_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanif_home);

        getSupportActionBar().setTitle("Hanif");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(Hanif_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void destime6(View view) {
        Intent intent = new Intent(Hanif_home.this,Das_Time_Hanif.class);
        startActivity(intent);
    }

    public void amountHanif(View view) {
        Intent intent = new Intent(Hanif_home.this,Amount_Hanif.class);
        startActivity(intent);
    }

    public void choise2(View view) {
        Intent intent = new Intent(Hanif_home.this,Choise_Seat_Hanif.class);
        startActivity(intent);
    }

    public void buyTicket1(View view) {
        Intent intent = new Intent(Hanif_home.this,Buy_Ticket_Hanif.class);
        startActivity(intent);
    }
}
