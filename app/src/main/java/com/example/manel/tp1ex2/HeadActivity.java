package com.example.manel.tp1ex2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.manel.tp1ex2.Fragments.HeadFragment;

public class HeadActivity extends AppCompatActivity {

    HeadFragment headFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);

        //Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //Show Fragmentmain
        headFragment=new HeadFragment();
        transaction.add(R.id.framehead, headFragment);
        transaction.commit();
    }
}
