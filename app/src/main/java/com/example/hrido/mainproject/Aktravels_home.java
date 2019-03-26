package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aktravels_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktravels_home);

        getSupportActionBar().setTitle("Ak Travels");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(Aktravels_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void amountAk(View view) {
        Intent intent = new Intent(Aktravels_home.this,Amount_Ak.class);
        startActivity(intent);
    }

    public void destimeAk(View view) {
        Intent intent = new Intent(Aktravels_home.this,Des_Time_Ak.class);
        startActivity(intent);
    }

    public void choise(View view) {
        Intent intent = new Intent(Aktravels_home.this,Choise_Seat_Ak.class);
        startActivity(intent);
    }

    public void purchaseTicket(View view) {
        Intent intent = new Intent(Aktravels_home.this,Ticket_Location.class);
        startActivity(intent);
    }
}
