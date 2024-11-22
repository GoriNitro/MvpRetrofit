package com.example.shoppinglist.presentation.presenter

import com.example.shoppinglist.data.remote.model.PlaceModel

interface UserView {
    fun getUser(user: PlaceModel)
    fun showToast()
}