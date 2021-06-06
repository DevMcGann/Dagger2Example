package com.devtides.countries.di

import com.devtides.countries.model.CountriesService
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Component
@Singleton
interface AppComponent {
    fun getCountriesService() : CountriesService
}