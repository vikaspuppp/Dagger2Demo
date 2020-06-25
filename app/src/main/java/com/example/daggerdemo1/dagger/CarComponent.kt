package com.example.daggerdemo1.dagger

import android.os.Build
import com.example.daggerdemo1.MainActivity
import com.example.daggerdemo1.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class,PetrolEngineModule::class,DriverModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun horsePower(@Named("horsePower")horsePower:Int):Builder
        @BindsInstance
        fun capacity( @Named("capcity") capacity:Int):Builder

        fun build(): CarComponent
    }
}