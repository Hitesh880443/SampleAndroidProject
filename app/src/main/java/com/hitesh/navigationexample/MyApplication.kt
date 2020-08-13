package com.hitesh.navigationexample

import android.app.Application
import com.hitesh.navigationexample.di.repoModule
import com.hitesh.navigationexample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(repoModule, viewModelModule)
        }
    }
}