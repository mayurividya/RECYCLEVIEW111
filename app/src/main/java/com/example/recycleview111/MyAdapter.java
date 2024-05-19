package com.example.recycleview111;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<MyViewholder> {
    private  List<String> body;

    public MyAdapter(List<String> body, List<String> title) {
        this.body = body;
        this.title = title;
    }

    private  List<String> title;


    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        holder.bodyTextview.setText(body.get(position));
        holder.titleTextview.setText(title.get(position));

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}









