package com.example.daggerdemo1.dagger

import dagger.Module
import dagger.Provides

@Module
class DriverModule {

    @Provides
    fun driverName(): String =  "Vikas"



}