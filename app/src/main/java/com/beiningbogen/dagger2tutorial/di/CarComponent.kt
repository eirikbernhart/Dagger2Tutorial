package com.beiningbogen.dagger2tutorial.di

import com.beiningbogen.dagger2tutorial.testing.car.Car
import dagger.Component

@Component (modules = [
    WheelsModule::class,
    DieselEngineModule::class
])
interface CarComponent {

    fun getCar(): Car
}
