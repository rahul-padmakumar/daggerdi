package com.example.daggerdi

import dagger.Component

@Component(modules = [SampleModule::class])
interface SampleComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface  Builder{

        fun sampleModule(sampleModule: SampleModule): Builder
        fun build(): SampleComponent
    }
}