package com.example.zooanimalapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(
    tableName = "fishes"
)
data class Fish(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @Json(name = "Availability")
    val availability: String,
    @Json(name = "Calories")
    val calories: String,
    @Json(name = "Cholesterol")
    val cholesterol: String,
    @Json(name = "Color")
    val color: String,
    @Json(name = "Farming Methods")
    val farmingMethods: String,
    @Json(name = "Fat, Total")
    val fatTotal: String,
    @Json(name = "Fiber, Total Dietary")
    val fiberTotalDietary: String,
    @Json(name = "Fishing Rate")
    val fishingRate: String,
    @Json(name = "Habitat")
    val habitat: String,
    @Json(name = "Harvest")
    val harvest: String,
    @Json(name = "Harvest Type")
    val harvestType: String,
    @Json(name = "Health Benefits")
    val healthBenefits: String,
    @Json(name = "Human Health")
    val humanHealth: String,
    @Json(name = "Location")
    val location: String,
    @Json(name = "Physical Description")
    val physicalDescription: String,
    @Json(name = "Population")
    val population: String,
    @Json(name = "Protein")
    val protein: String,
    @Json(name = "Quote")
    val quote: String,
    @Json(name = "Saturated Fatty Acids, Total")
    val saturatedFattyAcidsTotal: String,
    @Json(name = "Scientific Name")
    val scientificName: String,
    @Json(name = "Sodium")
    val sodium: String,
    @Json(name = "Species Illustration Photo")
    val speciesIllustrationPhoto: SpeciesIllustrationPhoto,
    @Json(name = "Species Name")
    val speciesName: String,
    @Json(name = "SugarsTotal")
    val sugarsTotal: String,
    @Json(name = "Taste")
    val taste: String,
    @Json(name = "Texture")
    val texture: String
)