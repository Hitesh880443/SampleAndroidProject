package com.hitesh.navigationexample.modules.home.model

import com.google.gson.annotations.SerializedName

data class UsersParentModel(
    @SerializedName("data")
    val userList: ArrayList<User>
)