package com.example.zooanimalapp.database

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.zooanimalapp.models.SpeciesIllustrationPhoto

class Converters {

    @TypeConverter
    fun fromSpeciesIllustrationPhoto(photo: SpeciesIllustrationPhoto): String {
        return photo.src
    }

    @TypeConverter
    fun toSpeciesIllustrationPhoto(src: String) : SpeciesIllustrationPhoto{
        return SpeciesIllustrationPhoto(src, src)
    }
}