package com.example.zooanimalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zooanimalapp.API.RetrofitInstance
import com.example.zooanimalapp.database.FishDatabase
import com.example.zooanimalapp.models.Fish
import com.example.zooanimalapp.repository.FishRepository
import com.example.zooanimalapp.ui.FishViewModel
import com.example.zooanimalapp.ui.FishViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_saved.*

class MainActivity : AppCompatActivity() {

    lateinit var viewmodel: FishViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fishRepository = FishRepository(FishDatabase(this))
        val viewModelProviderFactory = FishViewModelProviderFactory(fishRepository)
        viewmodel = ViewModelProvider(this, viewModelProviderFactory).get(FishViewModel::class.java)

        bottomNavigationView.setupWithNavController(fishNavHostFragment.findNavController())
    }
}