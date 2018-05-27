package com.example.kcruz.room;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kcruz.room.fragments.LogInFragment;

public class MainActivity extends AppCompatActivity implements LogInFragment.LoginClickListener{
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogInFragment frag = new LogInFragment();
        //frag.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout, frag);
        fragmentTransaction.commit();
    }

    @Override
    public void onLogInClick(View v) {

    }
}
