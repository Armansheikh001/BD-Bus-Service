package com.example.hrido.mainproject;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Das_Time_purbasha extends AppCompatActivity {

    private Des_Purbasha desti1;
    private Time_purbasha clock1;

    private BottomNavigationView navigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_time);


        navigationView = findViewById(R.id.nev);
        frameLayout = findViewById(R.id.main_frame);

        desti1 = new Des_Purbasha();
        clock1 = new Time_purbasha();

        setFragment(desti1);


        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.destination :
                        navigationView.setItemBackgroundResource(R.color.colorPrimaryDark2);
                        setFragment(desti1);
                        return true;

                    case R.id.time :
                        navigationView.setItemBackgroundResource(R.color.colorPrimaryDark2);
                        setFragment(clock1);
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
