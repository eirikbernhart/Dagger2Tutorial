package com.beiningbogen.dagger2tutorial.testing.car

import timber.log.Timber
import javax.inject.Inject

// Dagger provides constructor args
class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) { // CONSTRUCTOR INJECTION

    @Inject // FIELD INJECTION
    // private lateinit var engine: Engine

    // METHOD INJECTION
    // Dagger will automatically call this fun after the constructor has finished.
    // It'll create a Remote obj and execute setListener().
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        Timber.d("Car is driving...")
    }
}
