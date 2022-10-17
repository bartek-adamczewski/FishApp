package com.example.zooanimalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zooanimalapp.API.RetrofitInstance
import com.example.zooanimalapp.models.Fish
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_saved.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setupWithNavController(fishNavHostFragment.findNavController())
    }
}