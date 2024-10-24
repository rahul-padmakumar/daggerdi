package com.example.daggerdi

import dagger.Component

@Component(modules = [SampleModule::class])
interface SampleComponent {
    fun inject(mainActivity: MainActivity)
}