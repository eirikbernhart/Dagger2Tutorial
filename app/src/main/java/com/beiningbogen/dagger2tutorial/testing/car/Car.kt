package com.beiningbogen.dagger2tutorial.testing.car

import com.beiningbogen.dagger2tutorial.testing.car.emulateexternallibrary.Wheels
import com.beiningbogen.dagger2tutorial.testing.car.engine.Engine
import timber.log.Timber
import javax.inject.Inject

// Dagger provides constructor args
class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) { // CONSTRUCTOR INJECTION

    // @Inject FIELD INJECTION
    // private lateinit var engine: Engine

    // METHOD INJECTION
    // Dagger will automatically call this fun after the constructor has finished.
    // It'll create a Remote obj and execute setListener().
    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Timber.d("Car -> Car is driving...")
    }
}
