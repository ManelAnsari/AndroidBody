package com.example.manel.tp1ex2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.manel.tp1ex2.Fragments.HeadFragment;
import com.example.manel.tp1ex2.Fragments.LegFragment;

public class LegActivity extends AppCompatActivity {

   LegFragment LegFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);
        //Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //Show Fragmentmain
        LegFragment=new LegFragment();
        transaction.add(R.id.framehead, LegFragment);
        transaction.commit();
    }
}

