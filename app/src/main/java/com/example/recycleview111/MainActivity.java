package com.example.recycleview111;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<String> bodyTextview,titleTextview;
    ArrayList<item> itemArrayList = new ArrayList<>();
    interface  Apiservice{
        @GET("/posts")
        Call<List<item>> getUsers();
    }
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     bodyTextview=findViewById(R.id.recycleview);
     titleTextview=findViewById(R.id.recycleview);
        bodyTextview = new  ArrayList<>();
        titleTextview= new ArrayList<>();
        for (int i=1; i<=30; i++){
            bodyTextview.add("body " + i);
            titleTextview.add("title " +i);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=  new MyAdapter(bodyTextview,titleTextview);
        recyclerView.setAdapter(adapter);
    }
}