package com.hitesh.navigationexample.di

import com.hitesh.navigationexample.modules.home.HomeRepository
import com.hitesh.navigationexample.modules.home.HomeViewModel
import com.hitesh.navigationexample.modules.search.SearchRepository
import com.hitesh.navigationexample.modules.setting.SettingRepository
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repoModule = module {
    factory { HomeRepository(get()) }
    factory { SearchRepository(androidContext()) }
    factory { SettingRepository(androidContext()) }
}
