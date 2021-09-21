package com.example.taskmanagerusingmvvm.models.remote.responses


import com.google.gson.annotations.SerializedName

data class LoginResponse(

    @SerializedName("token")
    val token: String,
    @SerializedName("user")
    val user: User

)