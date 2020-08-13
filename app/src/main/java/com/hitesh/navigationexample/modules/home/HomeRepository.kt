package com.hitesh.navigationexample.modules.home

import com.hitesh.navigationexample.network.UsersApi

class HomeRepository(private val api: UsersApi) {
    suspend fun getUsers() = api.getUsers()
}