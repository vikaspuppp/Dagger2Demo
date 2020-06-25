package com.example.daggerdemo1.car

import android.util.Log
import com.example.daggerdemo1.car.Engine
import javax.inject.Inject

class DieselEngine  @Inject constructor(var horsePower: Int) : Engine {
     override fun start() {
         Log.d("Diesel engine", "Diesel engine started. horsepower:$horsePower")
     }
    
 }