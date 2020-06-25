package com.example.daggerdemo1.dagger

import com.example.daggerdemo1.car.Rims
import com.example.daggerdemo1.car.Tyres
import com.example.daggerdemo1.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun providesRims(): Rims {
        return Rims()
    }

    @Provides
    fun providesTyres(): Tyres {
        val tyre = Tyres()
        tyre.print()
        return tyre
    }

    @Provides
    fun providesWheels(rims: Rims, tyres: Tyres): Wheels {
        return Wheels(rims, tyres)
    }
}