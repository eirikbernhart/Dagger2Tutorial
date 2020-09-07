package com.beiningbogen.dagger2tutorial.testing.car.engine

import com.beiningbogen.dagger2tutorial.testing.car.engine.Engine
import timber.log.Timber
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    override fun start() {
        Timber.d("Car -> Petrol engine started")
    }
}
