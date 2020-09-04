package com.beiningbogen.dagger2tutorial.testing.car

import timber.log.Timber
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Timber.d("Remote connected")
    }
}
