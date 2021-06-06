package com.devtides.countries.di

import com.devtides.countries.view.CountryListAdapter
import dagger.Module
import dagger.Provides

@Module
class CountriesListAdapterModule {
    @Module
    companion object{
        @Provides
        @JvmStatic
        @PerActivity
        fun provideCLA():CountryListAdapter = CountryListAdapter(arrayListOf())
    }


}