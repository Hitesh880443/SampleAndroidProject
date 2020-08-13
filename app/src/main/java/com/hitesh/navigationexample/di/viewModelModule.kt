package com.hitesh.navigationexample.di

import com.hitesh.navigationexample.modules.home.HomeViewModel
import com.hitesh.navigationexample.modules.search.SearchViewModel
import com.hitesh.navigationexample.modules.setting.SettingViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(homeRepository = get()) }
    viewModel { SearchViewModel(searchRepository = get()) }
    viewModel { SettingViewModel(settingRepository = get()) }
}
