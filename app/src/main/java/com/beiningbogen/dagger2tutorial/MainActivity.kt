package com.beiningbogen.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beiningbogen.dagger2tutorial.di.DaggerCarComponent
import com.beiningbogen.dagger2tutorial.testing.car.Car

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()

        car = carComponent.getCar()
        car.drive()
    }
}
