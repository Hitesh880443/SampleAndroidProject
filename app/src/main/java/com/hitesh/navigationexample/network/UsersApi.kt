package com.hitesh.navigationexample.network

import com.hitesh.navigationexample.modules.home.model.UsersParentModel
import retrofit2.http.GET

interface UsersApi {
    @GET("users/")
    suspend fun getUsers(): UsersParentModel
}