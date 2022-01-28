package com.example.assignment2.repository

import com.example.assignment2.api.RetrofitInstance
import com.example.assignment2.models.Tractor
import retrofit2.Response

class TractorRepository {
    suspend fun getDetails(): Response<Tractor> {
        return RetrofitInstance.api.getDetails()
    }
}