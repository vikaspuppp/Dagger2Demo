package com.example.daggerdemo1.car

import com.example.daggerdemo1.car.Rims
import com.example.daggerdemo1.car.Tyres


class Wheels constructor(rims: Rims, tyre: Tyres) {
    // This is 3rd lib class, so we can't annotate with @inject

}