package com.example.hrido.mainproject;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Buy_Ticket_Purbasha extends AppCompatActivity {

    String number="01713568870";
    int REQUEST_CALL =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy__ticket__purbasha);

        getSupportActionBar().setTitle("Purchase Ticket");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.call_purbasha);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                call5();

            }
        });


    }

    public void call5() {

        if (number.trim().length() >0) {

                if (ContextCompat.checkSelfPermission(Buy_Ticket_Purbasha.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Buy_Ticket_Purbasha.this,
                            new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                } else {
                    String dial = "tel:"+ number;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }

            } else {
                Toast.makeText(Buy_Ticket_Purbasha.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
            if (requestCode == REQUEST_CALL) {
                if (grantResults.length  >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    call5();
                } else {
                    Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }


