package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Londonexpress_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_londonexpress_home);

        getSupportActionBar().setTitle("London Express");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(Londonexpress_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void amountLondon(View view) {
        Intent intent = new Intent(Londonexpress_home.this,Amount_London.class);
        startActivity(intent);
    }

    public void destimeLondon(View view) {
        Intent intent = new Intent(Londonexpress_home.this,Des_Time_London.class);
        startActivity(intent);
    }

    public void choise4(View view) {
        Intent intent = new Intent(Londonexpress_home.this,Choise_Seat_London.class);
        startActivity(intent);
    }

    public void buyTicket6(View view) {
        Intent intent = new Intent(Londonexpress_home.this,Buy_Ticket_London.class);
        startActivity(intent);
    }
}
