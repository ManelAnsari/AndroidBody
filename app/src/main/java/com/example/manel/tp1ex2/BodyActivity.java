package com.example.manel.tp1ex2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.manel.tp1ex2.Fragments.BodyFragment;

public class BodyActivity extends AppCompatActivity {
BodyFragment bodyfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        //Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //Show Fragmentmain
        bodyfragment=new BodyFragment();
        transaction.add(R.id.framebody, bodyfragment);
        transaction.commit();
    }
}
