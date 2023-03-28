package com.example.midterm.data.networking

import com.example.midterm.data.ApiResponse
import retrofit2.http.GET

interface ApiService {
    @GET("/api/?inc=nat,name,email&results=100")
    suspend fun getPeople(): ApiResponse
}
