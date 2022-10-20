package com.example.zooanimalapp.repository

import com.example.zooanimalapp.API.RetrofitInstance
import com.example.zooanimalapp.database.FishDatabase

class FishRepository(
    val db: FishDatabase
    ) {

    suspend fun getFish() = RetrofitInstance.api.getFish()

}