package com.example.zooanimalapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.zooanimalapp.models.Fish


@Dao
interface FishDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(fish: Fish): Long

    @Query("SELECT * FROM fishes")
    fun getAllFishes(): LiveData<List<Fish>>

    @Delete
    suspend fun deleteFish(fish: Fish)
}