package com.example.zooanimalapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.zooanimalapp.API.RetrofitInstance
import com.example.zooanimalapp.R
import com.example.zooanimalapp.models.Fish
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_saved.*
import retrofit2.HttpException

const val TAG = "fragmentSaved"

class SavedFragment : Fragment(R.layout.fragment_saved) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}