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

public class NotesListFragment extends Fragment {
    Activity activity;
    CustomizeListAdapter customizeListAdapter;
    RecyclerView listView;
    LinearLayoutManager lManager;
    List<String> notes;

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

        customizeListAdapter = new CustomizeListAdapter(activity,notes);
        listView.setAdapter(customizeListAdapter); //se le asigna al recycler lo que procesa el adapter de la informacion
        return view;
    }

    public void setList(){
        String note1 = "First Note...";
        String note2 = "First Note...";
        String note3 = "First Note...";
        String note4 = "First Note...";
        String note5 = "First Note...";
        String note6 = "First Note...";
        String note7 = "First Note...";
        String note8 = "First Note...";
        String note9 = "First Note...";
        String note10 = "First Note...";

        notes = new ArrayList<String>();
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        notes.add(note5);
        notes.add(note6);
        notes.add(note7);
        notes.add(note8);
        notes.add(note9);
        notes.add(note10);

    }

    @Override
    public void onResume() {
        getActivity().setTitle(R.string.notes);
        super.onResume();
    }
}
