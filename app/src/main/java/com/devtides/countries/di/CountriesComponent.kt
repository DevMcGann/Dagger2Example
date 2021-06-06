package com.devtides.countries.di

import com.devtides.countries.view.MainActivity
import dagger.Component

@Component(
    dependencies = [AppComponent::class],
    modules = [CountriesListAdapterModule::class])
@PerActivity
interface CountriesComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{
        fun appComponent(appComponent: AppComponent): Builder
        fun build():CountriesComponent
    }
}