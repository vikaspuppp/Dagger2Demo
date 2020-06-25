package com.example.daggerdemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerdemo1.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    /*
    * 1st way: Constructor injection

    private var car: Car? = null*/

    // 2nd way: Field injection
//    lateinit var car: Car

    //    3rd way: Method injection
    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = (application as MyApplication).carComponent

        carComponent.inject(this)
/*
     // * 1st way
        car = carComponent.getCar()
        */
        /*
        2nd way: Field injection
        carComponent.inject(this)*/
        car1?.drive()
        car2.drive()
    }
}
