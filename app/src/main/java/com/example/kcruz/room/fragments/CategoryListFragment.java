package com.example.kcruz.room.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kcruz.room.R;
import com.example.kcruz.room.adapters.CustomizeListAdapter;

import java.util.ArrayList;
import java.util.List;

public class CategoryListFragment extends Fragment {
    Activity activity;
    CustomizeListAdapter customizeListAdapter;
    RecyclerView listView;
    LinearLayoutManager lManager;
    List<String> category;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);

        listView = (RecyclerView) view.findViewById(R.id.list_menu);
        listView.setHasFixedSize(true);

        lManager = new LinearLayoutManager(container.getContext());
        listView.setLayoutManager(lManager);

        //aqui tendria que llamarse la tabla que contiene las notes
        setList();

        customizeListAdapter = new CustomizeListAdapter(activity,category);
        listView.setAdapter(customizeListAdapter); //se le asigna al recycler lo que procesa el adapter de la informacion
        return view;
    }

    public void setList(){
        String note1 = "First Category...";
        String note2 = "First Category...";
        String note3 = "First Category...";

        category = new ArrayList<String>();
        category.add(note1);
        category.add(note2);
        category.add(note3);
    }

    @Override
    public void onResume() {
        getActivity().setTitle(R.string.notes);
        super.onResume();
    }
}
