package com.example.daggerdi.dependent_component

import javax.inject.Inject

class DependentNetworkService @Inject constructor(){
    fun fetchData(): String = "Data fetched from Network"
}