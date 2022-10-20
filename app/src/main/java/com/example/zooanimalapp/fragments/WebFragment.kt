package com.example.zooanimalapp.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.zooanimalapp.MainActivity
import com.example.zooanimalapp.R
import com.example.zooanimalapp.ui.FishViewModel

class WebFragment : Fragment(R.layout.fragment_web) {

    lateinit var viewmodel: FishViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel = (activity as MainActivity).viewmodel

    }

}