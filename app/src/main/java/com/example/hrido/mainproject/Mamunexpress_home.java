package com.example.hrido.mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mamunexpress_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamunexpress_home);

        getSupportActionBar().setTitle("Mamun Express");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void details(View view) {
        Intent intent = new Intent(Mamunexpress_home.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void amountMamun(View view) {
        Intent intent = new Intent(Mamunexpress_home.this,Amount_Mamun.class);
        startActivity(intent);
    }

    public void destime9(View view) {
        Intent intent = new Intent(Mamunexpress_home.this,Des_Time_Mamun.class);
        startActivity(intent);
    }

    public void choise5(View view) {
        Intent intent = new Intent(Mamunexpress_home.this,Choise_Seat_Mamun.class);
        startActivity(intent);
    }

    public void buyTicket3(View view) {
        Intent intent = new Intent(Mamunexpress_home.this,Buy_Ticket_Mamun.class);
        startActivity(intent);
    }
}
