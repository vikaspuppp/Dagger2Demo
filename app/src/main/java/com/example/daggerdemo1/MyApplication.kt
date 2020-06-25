package com.example.daggerdemo1

import android.app.Application
import com.example.daggerdemo1.dagger.CarComponent
import com.example.daggerdemo1.dagger.DaggerCarComponent

class MyApplication : Application() {
    lateinit var carComponent: CarComponent
    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerCarComponent.builder().horsePower(100).capacity(1500).build()

    }
}