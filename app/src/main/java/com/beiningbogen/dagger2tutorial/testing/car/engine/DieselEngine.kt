package com.beiningbogen.dagger2tutorial.testing.car.engine

import timber.log.Timber

class DieselEngine(private val horsePower: Int) : Engine {
    override fun start() {
        Timber.d("Car -> Diesel engine started. Horsepower: $horsePower")
    }
}
