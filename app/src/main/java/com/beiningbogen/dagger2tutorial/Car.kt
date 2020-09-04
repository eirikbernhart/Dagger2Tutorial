package com.beiningbogen.dagger2tutorial

import timber.log.Timber
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {
    fun drive() {
        Timber.d("Car is driving...")
    }
}
