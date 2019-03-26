package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Royal_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royal_home);

        getSupportActionBar().setTitle("Royal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(Royal_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void destime5(View view) {
        Intent intent = new Intent(Royal_home.this,Das_Time_Royal.class);
        startActivity(intent);
    }

    public void amountRoyal(View view) {
        Intent intent = new Intent(Royal_home.this,Amount_Royal.class);
        startActivity(intent);
    }

    public void choise7(View view) {
        Intent intent = new Intent(Royal_home.this,Choise_Seat_Royal.class);
        startActivity(intent);
    }

    public void buyTicket4(View view) {
        Intent intent = new Intent(Royal_home.this,Buy_Ticket_Royal.class);
        startActivity(intent);
    }
}
