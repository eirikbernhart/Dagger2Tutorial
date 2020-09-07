package com.beiningbogen.dagger2tutorial.testing.car.emulateexternallibrary

import timber.log.Timber

// This is supposed to be  a class from outside, that we don't "own"
class Tires {
    fun inflate() {
        Timber.d("Car -> Tire inflated!")
    }
}
