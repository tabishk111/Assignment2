package com.example.assignment2.models

data class TractorPictureSet(
    val id : Long,
    val tractor: Long,
    val image_url : String?,
    val is_default: Boolean
)