package com.example.manel.tp1ex2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.manel.tp1ex2.Fragments.BodyFragment;
import com.example.manel.tp1ex2.Fragments.HandFragment;
import com.example.manel.tp1ex2.Fragments.HeadFragment;
import com.example.manel.tp1ex2.Fragments.LegFragment;
import com.example.manel.tp1ex2.Fragments.MainFragment;

public class MainActivity extends AppCompatActivity implements MainFragment.OnButtonClickedListener{
MainFragment fragmentmain;
HeadFragment fragmenthead;
HandFragment fragmenthand;
BodyFragment fragmentbody;
LegFragment fragmentleg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (findViewById(R.id.framebody) == null) {
            //Show Fragmentmain smatphone
            fragmentmain = new MainFragment();
            transaction.add(R.id.framemain, fragmentmain);
        }
        else
        {
            //Show Fragment tablet
            fragmenthead = new HeadFragment();
            transaction.add(R.id.framemain, fragmenthead);

            fragmentbody = new BodyFragment();
            transaction.add(R.id.framebody, fragmentbody);

            fragmenthand = new HandFragment();
            transaction.add(R.id.framehandleft, fragmenthand);


            fragmentleg = new LegFragment();
            transaction.add(R.id.frameleg, fragmentleg);

        }
        transaction.commit();
    }

    @Override
    public void OnBtnheadClicked(View v) {
        Intent i = new Intent(this, HeadActivity.class);
        startActivity(i);
    }

    @Override
    public void OnBtnhandClicked(View v) {
        Intent i = new Intent(this, HandActivity.class);
        startActivity(i);
    }

    @Override
    public void OnBtnlegClicked(View v) {
        Intent i = new Intent(this, LegActivity.class);
        startActivity(i);
    }

    @Override
    public void OnBtnbodyClicked(View v) {
        Intent i = new Intent(this, BodyActivity.class);
        startActivity(i);
    }
}
