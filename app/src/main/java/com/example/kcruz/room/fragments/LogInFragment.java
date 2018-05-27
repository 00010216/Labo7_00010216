package com.example.kcruz.room.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kcruz.room.R;

import java.util.List;

public class LogInFragment extends android.support.v4.app.Fragment {
    Activity activity;
    Button login;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();

    }

    public interface LoginClickListener{
        public void onLogInClick(View v);
    }

    LoginClickListener mlistener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_log_in,container,false);
        login = view.findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mlistener.onLogInClick(v);
            }
        });
        return view;
    }
}
