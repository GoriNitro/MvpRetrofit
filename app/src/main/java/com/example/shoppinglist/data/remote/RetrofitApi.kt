package com.example.shoppinglist.data.remote

import com.example.shoppinglist.data.remote.model.PlaceModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitApi {

    @GET("/posts/{id}")
    fun getUser(@Path("id") userId: String) : Call<PlaceModel>
}