package com.example.recycleview111;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class Interface {
    interface  Apiservice{
        @GET("/posts")
        Call<List<item>> getUsers();
    }


}
