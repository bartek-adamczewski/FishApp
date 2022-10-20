package com.example.zooanimalapp.API

import com.example.zooanimalapp.models.Fish
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {
    val api: FishApi by lazy{
        Retrofit.Builder()
            .baseUrl("https://www.fishwatch.gov/api/species/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(FishApi::class.java)
    }
}