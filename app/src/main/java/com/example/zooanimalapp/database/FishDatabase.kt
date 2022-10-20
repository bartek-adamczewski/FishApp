package com.example.zooanimalapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.zooanimalapp.models.Fish

@Database(
    entities = [Fish::class],
    version = 1,
    exportSchema = false
)

@TypeConverters(Converters::class)

abstract class FishDatabase : RoomDatabase() {

    abstract suspend fun getFishDao(): FishDao

    companion object{
        @Volatile
        private var instance: FishDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: createDatabase(context).also{ instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                FishDatabase::class.java,
                "fish_db.db"
            ).build()
    }

}