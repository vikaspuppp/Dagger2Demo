package com.example.daggerdemo1.car

import android.util.Log

class Tyres {
    // This is 3rd lib class, so we can't annotate with @inject

    fun print(){
        Log.d("Tyre","Tyres ready to use.")
    }
}