package com.example.daggerdi.dependent_component

import javax.inject.Inject

class DependentUserRepository @Inject constructor(private val networkService: DependentNetworkService) {
    fun fetchUserInfo(): String = "User data: ${networkService.fetchData()}"
}