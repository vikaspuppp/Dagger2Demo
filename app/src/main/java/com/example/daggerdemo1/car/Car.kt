package com.example.daggerdemo1.car

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(var driver:Driver,private var engine: Engine, private var wheel: Wheels) {

    fun drive() {
        Log.d("Car", "$driver is dRIVING $this ")
        engine.start()
    }
}