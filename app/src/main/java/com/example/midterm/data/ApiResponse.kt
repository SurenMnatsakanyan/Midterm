package com.example.midterm.data

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("results")
    val results: List<Person>,
)
