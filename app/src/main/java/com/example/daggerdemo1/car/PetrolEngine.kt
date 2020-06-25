package com.example.daggerdemo1.car

import android.util.Log
import com.example.daggerdemo1.car.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower") var horsePower :Int, @Named("capcity") var capcity :Int) : Engine {
     override fun start() {
         Log.d("Petrol engine", "Petrol engine started. HorsePower: $horsePower,  capcity:$capcity")
     }
 }