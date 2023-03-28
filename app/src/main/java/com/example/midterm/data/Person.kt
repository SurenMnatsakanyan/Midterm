package com.example.midterm.data

import com.google.gson.annotations.SerializedName

data class Person(
    @SerializedName("name")
    val name: Name,
    @SerializedName("email")
    val email: String,
    @SerializedName("nat")
    val nat: String,
) {
    data class Name(
        @SerializedName("title")
        val title: String,
        @SerializedName("first")
        val first: String,
        @SerializedName("last")
        val last: String,
    )
}
