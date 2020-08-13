package com.hitesh.navigationexample.modules.home.model

data class User(
    val id: Int,
    val email: String,
    val first_name: String,
    val last_name: String,
    val avatar: String
) {
    val fullName: String
        get() {
            return "$first_name $last_name"
        }
}