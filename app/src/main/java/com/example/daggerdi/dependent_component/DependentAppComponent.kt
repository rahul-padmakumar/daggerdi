package com.example.daggerdi.dependent_component

import dagger.Component

@Component
interface DependentAppComponent{
    fun networkService(): DependentNetworkService
}