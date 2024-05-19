package com.example.recycleview111;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewholder extends RecyclerView.ViewHolder {
    TextView bodyTextview;
    TextView titleTextview;


    public MyViewholder(@NonNull View itemView) {
        super(itemView);
        bodyTextview=itemView.findViewById(R.id.bodyTextview);
        titleTextview=itemView.findViewById(R.id.titleTextview);


    }
}
