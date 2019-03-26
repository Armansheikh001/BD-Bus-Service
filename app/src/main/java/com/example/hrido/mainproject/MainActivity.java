package com.example.hrido.mainproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void info(View view) {
        Intent intent= new Intent(MainActivity.this,Southline_home.class);
        startActivity(intent);

    }

    public void info1(View view) {
        Intent intent= new Intent(MainActivity.this,goldenline_home.class);
        startActivity(intent);
    }

    public void infoPurbasha(View view) {
        Intent intent= new Intent(MainActivity.this,purbasha_home.class);
        startActivity(intent);
    }

    public void infoEagle(View view) {
        Intent intent= new Intent(MainActivity.this,eagle.class);
        startActivity(intent);
    }

    public void infoRoyal(View view) {
        Intent intent= new Intent(MainActivity.this,Royal_home.class);
        startActivity(intent);
    }

    public void infoHanif(View view) {
        Intent intent= new Intent(MainActivity.this,Hanif_home.class);
        startActivity(intent);
    }

    public void infoShohag(View view) {
        Intent intent= new Intent(MainActivity.this,Shohagscaina_home.class);
        startActivity(intent);
    }

    public void infoJr(View view) {
        Intent intent= new Intent(MainActivity.this,Jr_home.class);
        startActivity(intent);
    }

    public void infoMamun(View view) {
        Intent intent= new Intent(MainActivity.this,Mamunexpress_home.class);
        startActivity(intent);
    }

    public void infoAK(View view) {
        Intent intent= new Intent(MainActivity.this,Aktravels_home.class);
        startActivity(intent);
    }

    public void infoLondon(View view) {
        Intent intent= new Intent(MainActivity.this,Londonexpress_home.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder aleartdialog;
        aleartdialog =new AlertDialog.Builder(MainActivity.this);
        aleartdialog.setIcon(R.drawable.exiticon);
        aleartdialog.setTitle("Confirm Exit..?");
        aleartdialog.setMessage("Are you sure you want to exit...?");
        aleartdialog.setCancelable(false);

        aleartdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        aleartdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
           AlertDialog alertDialog = aleartdialog.create();
           aleartdialog.show();
    }
}
