package com.example.daggerdemo1.car

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
data class Driver @Inject constructor( var name :String) {
}