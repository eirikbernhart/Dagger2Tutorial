package com.beiningbogen.dagger2tutorial.testing.car.emulateexternallibrary

import javax.inject.Inject

// This is supposed to be  a class from outside, that we don't "own"
// We don't own this class so we can't annotate it with @Inject
class Wheels @Inject constructor(
    private val rims: Rims,
    private val tires: Tires
)
