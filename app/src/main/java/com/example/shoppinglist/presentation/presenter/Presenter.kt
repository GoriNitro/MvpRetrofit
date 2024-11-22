package com.example.shoppinglist.presentation.presenter

import com.example.shoppinglist.data.remote.RetrofitService
import com.example.shoppinglist.data.remote.model.PlaceModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(val view: UserView) {
    private val api = RetrofitService()
    fun getData(id: Int){
        api.api.getUser(id.toString()).enqueue(object : Callback<PlaceModel> {
            override fun onResponse(call: Call<PlaceModel>, response: Response<PlaceModel>) {
                if (response.isSuccessful) {
                    view.getUser(response.body()!!)
                }
            }

            override fun onFailure(call: Call<PlaceModel>, t: Throwable) {

            }
        })
    }
}