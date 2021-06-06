package com.devtides.countries

import android.app.Application
import com.devtides.countries.di.AppComponent
import com.devtides.countries.di.DaggerAppComponent

class CountriesApp : Application(){
    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}