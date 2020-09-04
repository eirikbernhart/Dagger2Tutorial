package com.beiningbogen.dagger2tutorial

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}
