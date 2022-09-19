package com.muhammaddevin.android.get_api_with_query.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.muhammaddevin.android.get_api_with_query.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameGit = "devin"

        val viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        viewModel.searchUserApi(usernameGit)

        viewModel.getSearchUser().observe(this){
            Log.i("TAG", "onCreate: $it")

            println("nama saya ---> ${it.items?.get(0)?.login}")


        }
    }
}