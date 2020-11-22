package com.example.manel.tp1ex2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.manel.tp1ex2.Fragments.HandFragment;
import com.example.manel.tp1ex2.Fragments.HeadFragment;

public class HandActivity extends AppCompatActivity
{

HandFragment HandFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);
        //Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //Show Fragmentmain
        HandFragment=new HandFragment();
        transaction.add(R.id.framehead, HandFragment);
        transaction.commit();
    }
}

