package com.example.zooanimalapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zooanimalapp.MainActivity
import com.example.zooanimalapp.R
import com.example.zooanimalapp.Resource
import com.example.zooanimalapp.adapters.FishAdapter
import com.example.zooanimalapp.ui.FishViewModel
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment(R.layout.fragment_search) {

    lateinit var viewmodel: FishViewModel
    lateinit var fishAdapter: FishAdapter

    val TAG = "SearchFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel = (activity as MainActivity).viewmodel
        setUpRecyclerView()

        viewmodel.fishes.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    response.data?.let { fishesResponse ->
                        fishAdapter.differ.submitList(fishesResponse)
                    }
                }
                is Resource.Error -> {
                    response.message?.let { message ->
                        Log.e(TAG, "Error : $message")
                    }
                }
                is Resource.Loading -> {
                    TODO("Cover that case.")
                }
            }

        })

    }

    private fun setUpRecyclerView() {
        fishAdapter = FishAdapter()
        rvFish.apply {
            adapter = fishAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}