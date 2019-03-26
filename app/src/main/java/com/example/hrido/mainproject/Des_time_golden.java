package com.example.hrido.mainproject;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Des_time_golden extends AppCompatActivity {


    private Des_golden desti2;
    private Time_golden clock2;

    private BottomNavigationView navigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_time);


        navigationView = findViewById(R.id.nev);
        frameLayout = findViewById(R.id.main_frame);

        desti2 = new Des_golden();
        clock2 = new Time_golden();

        setFragment(desti2);


        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.destination :
                        navigationView.setItemBackgroundResource(R.color.colorPrimaryDark2);
                        setFragment(desti2);
                        return true;

                    case R.id.time :
                        navigationView.setItemBackgroundResource(R.color.colorPrimaryDark2);
                        setFragment(clock2);
                        return true;
                    default:
                        return false;

                }


            }


            private void setFragment(Fragment fragment) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_frame,fragment);
                fragmentTransaction.commit();
            }
        });


    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();

    }
}
