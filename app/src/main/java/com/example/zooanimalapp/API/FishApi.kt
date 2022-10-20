package com.example.zooanimalapp.API

import com.example.zooanimalapp.models.Fish
import retrofit2.Response
import retrofit2.http.GET

interface FishApi {

    @GET("/fishes")
    suspend fun getFish(): Response<List<Fish>>

}