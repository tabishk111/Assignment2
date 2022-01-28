package com.example.assignment2.api

import com.example.assignment2.models.Tractor
import retrofit2.Response
import retrofit2.http.*

interface ProductAPI {

    @Headers("phone-number: 1234567890","token: e2d9d043-48f3-45c4-bfab-889043362d92")
    @GET("api/v1/tractors")
    suspend fun getDetails(
        @Query("lat")
        lat: String = "12.935",
        @Query("long")
        long: String = "77.596",
        @Query("tractor_implements")
        imp1:String = "3",
        @Query("tractor_implements")
        imp2:String = "4",
        @Query("page")
        page:String="2",

    ) : Response<Tractor>
}