package com.example.zooanimalapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zooanimalapp.Resource
import com.example.zooanimalapp.models.Fish
import com.example.zooanimalapp.repository.FishRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class FishViewModel(
    val fishRepository: FishRepository
    ) : ViewModel() {

        val fishes: MutableLiveData<Resource<Fish>> = MutableLiveData()

        init {
            getFishes()
        }

        fun getFishes() = viewModelScope.launch {
            fishes.postValue(Resource.Loading())
            val response = fishRepository.getFish()
            fishes.postValue(errorOrSuccess(response))
        }

        private fun errorOrSuccess(response: Response<List<Fish>>) : Resource<Fish> {
            if(response.isSuccessful){
                response.body()?.let { resultResponse ->
                    return Resource.Success(resultResponse)
                }
            }
            return Resource.Error(response.message())
        }
}