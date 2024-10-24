package com.example.daggerdi

import dagger.Module
import dagger.Provides

@Module
class SampleModule {
    @Provides
    fun provideSampleRepo(): SampleRepo = SampleRepo()
}