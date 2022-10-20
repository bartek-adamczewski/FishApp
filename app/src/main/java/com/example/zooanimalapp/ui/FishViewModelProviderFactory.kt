package com.example.zooanimalapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.zooanimalapp.repository.FishRepository

class FishViewModelProviderFactory(
    val fishRepository: FishRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FishViewModel(fishRepository) as T
    }
}