package com.example.daggerdemo1.dagger

import com.example.daggerdemo1.car.DieselEngine
import com.example.daggerdemo1.car.Engine
import com.example.daggerdemo1.car.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class DieselEngineModule constructor(var horsePower : Int) {
    @Provides
     fun provideEngine(engine: DieselEngine): Engine{
        return engine
    }
    @Provides
    fun provideHorsePower():Int {return horsePower}
}