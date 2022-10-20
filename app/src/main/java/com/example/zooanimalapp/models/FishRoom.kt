package com.example.zooanimalapp.models

import androidx.room.Entity
import com.squareup.moshi.Json


data class FishRoom(
    val src: String,
    val availability: String,
    val calories: String,
    val cholesterol: String,
    val color: String,
    val farmingMethods: String,
    val fatTotal: String,
    val fiberTotalDietary: String,
    val fishingRate: String,
    val habitat: String,
    val harvest: String,
    val harvestType: String,
    val healthBenefits: String,
    val humanHealth: String,
    val imageGallery: List<Any>,
    val location: String,
    val physicalDescription: String,
    val population: String,
    val protein: String,
    val quote: String,
    val saturatedFattyAcidsTotal: String,
    val scientificName: String,
    val sodium: String,
    val speciesIllustrationPhoto: SpeciesIllustrationPhoto,
    val speciesName: String,
    val sugarsTotal: String,
    val taste: String,
    val texture: String
)
