package com.hitesh.navigationexample.modules.home

import androidx.lifecycle.ViewModel

class HomeViewModel(val homeRepository: HomeRepository) : ViewModel() {
    val data = "Hi Welcome to my sample app"
}