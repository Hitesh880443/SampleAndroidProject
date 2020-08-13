package com.hitesh.navigationexample.modules.search

import androidx.lifecycle.ViewModel

class SearchViewModel(val searchRepository: SearchRepository) : ViewModel() {
    val data = "You can search many more thing here"
}