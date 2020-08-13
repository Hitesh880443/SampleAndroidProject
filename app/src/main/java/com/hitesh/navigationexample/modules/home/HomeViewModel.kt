package com.hitesh.navigationexample.modules.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hitesh.navigationexample.modules.home.model.User
import kotlinx.coroutines.launch

class HomeViewModel(val homeRepository: HomeRepository) : ViewModel() {
    val userList: MutableLiveData<ArrayList<User>> = MutableLiveData()

    init {
        viewModelScope.launch {
            getUses()
        }
    }

    private suspend fun getUses() {
        userList.value = homeRepository.getUsers().userList
    }
}