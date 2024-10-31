package com.example.daggerdi.dependent_component

import dagger.Component

@Component(dependencies = [DependentAppComponent::class])
interface DependentUserComponent {
    fun userRepo(): DependentUserRepository

    @Component.Factory
    interface UserComponentFactory{
        fun create(dependentAppComponent: DependentAppComponent): DependentUserComponent
    }
}