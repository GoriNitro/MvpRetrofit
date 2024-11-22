package com.example.shoppinglist.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglist.data.remote.model.PlaceModel
import com.example.shoppinglist.databinding.ActivityMainBinding
import com.example.shoppinglist.presentation.presenter.Presenter
import com.example.shoppinglist.presentation.presenter.UserView
import com.example.shoppinglist.utils.showShortToast

class MainActivity : AppCompatActivity(), UserView {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val presenter = Presenter(this)
        binding.buttonAdd.setOnClickListener {
            presenter.getData(1)

        }
    }

    override fun getUser(user: PlaceModel) {
        val result = "UserId: ${user.userId} Title: ${user.title}"
        binding.editText.text = result
    }

    override fun showToast() {
        showShortToast("Failure")
    }
}