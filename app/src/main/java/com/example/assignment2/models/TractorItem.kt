package com.example.assignment2.models

data class TractorItem(
    val distance: Double,
    val id: Int,
    val location: String,
    val make: String,
    val radius_of_operation: String,
    val size_hp: Int,
    val tractor_implements: List<TractorImplement>,
    val tractor_type: Int,
    val tractorpicture_set: List<TractorPictureSet>,
    val user: User,
    val vehicle_number: String
)