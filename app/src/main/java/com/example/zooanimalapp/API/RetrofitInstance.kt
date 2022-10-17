package com.example.zooanimalapp.API

import com.example.zooanimalapp.models.Fish
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: FishApi by lazy{
        Retrofit.Builder()
            .baseUrl("https://www.fishwatch.gov/api/species/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FishApi::class.java)
    }
}