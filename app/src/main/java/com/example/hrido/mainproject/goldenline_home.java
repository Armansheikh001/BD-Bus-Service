package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class goldenline_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldenline_home);

        getSupportActionBar().setTitle("Golden Line");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void backbtn2(View view) {
        Intent intent = new Intent(goldenline_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void destimeGolden(View view) {
        Intent intent = new Intent(goldenline_home.this,Des_time_golden.class);
        startActivity(intent);
    }

    public void amountGolden(View view) {
        Intent intent = new Intent(goldenline_home.this,Amount_Golden.class);
        startActivity(intent);
    }

    public void choiceseat(View view) {
        Intent intent=new Intent(goldenline_home.this,Choice_Seat.class);
        startActivity(intent);

    }

    public void buyTicket8(View view) {
        Intent intent=new Intent(goldenline_home.this,Buy_Ticket_Golden.class);
        startActivity(intent);
    }
}
