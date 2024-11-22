package com.example.shoppinglist.utils

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.showShortToast(msg: String){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}