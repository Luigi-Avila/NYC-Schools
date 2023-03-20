package com.example.a20230317_luisavila_nycschools.mainScreen.data.network

import com.example.a20230317_luisavila_nycschools.mainScreen.data.models.SchoolsResponse
import retrofit2.http.GET
import retrofit2.Response

interface SchoolClient {

    //GET all schools in NYC
    @GET("/resource/s3k6-pzi2.json")
    suspend fun getSchools(): Response<SchoolsResponse>

}