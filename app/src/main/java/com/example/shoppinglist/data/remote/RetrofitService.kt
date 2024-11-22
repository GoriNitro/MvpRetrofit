package com.example.shoppinglist.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .build()

    val api = retrofit.create(RetrofitApi::class.java)
}