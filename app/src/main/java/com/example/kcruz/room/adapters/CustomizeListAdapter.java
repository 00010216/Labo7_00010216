package com.example.kcruz.room.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kcruz.room.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{
    private Context context;
    List<String> notes;

    public ListAdapter(Context mContext, List<String> mNotes) {
        context = mContext;
        notes = mNotes;
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        //indica la vista donde se ubicaran la informaciond de la lista
        TextView title,description;

        public ListViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.notename_txt);
        }
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return (new ListViewHolder(view));
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.title.setText(notes.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

}
