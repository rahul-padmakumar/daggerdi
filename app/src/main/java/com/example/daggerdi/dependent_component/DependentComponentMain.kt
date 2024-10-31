package com.example.daggerdi.dependent_component

fun main(){
    val appComponent = DaggerDependentAppComponent.create()
    val userComponent = DaggerDependentUserComponent.factory()
        .create(appComponent)
    println(userComponent.userRepo().fetchUserInfo())
}