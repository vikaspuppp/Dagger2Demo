package com.example.daggerdemo1.dagger

import com.example.daggerdemo1.car.Engine
import com.example.daggerdemo1.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}