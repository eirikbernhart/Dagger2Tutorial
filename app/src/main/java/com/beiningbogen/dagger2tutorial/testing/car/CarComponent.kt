package com.beiningbogen.dagger2tutorial.testing.car

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}
