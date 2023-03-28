package com.example.midterm.data.networking

class Repository(private val apiService: ApiService = RetrofitObject.apiService) {
    suspend fun getPeople() = apiService.getPeople()
}
