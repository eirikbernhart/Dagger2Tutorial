package com.beiningbogen.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beiningbogen.dagger2tutorial.di.DaggerCarComponent
import com.beiningbogen.dagger2tutorial.di.DieselEngineModule
import com.beiningbogen.dagger2tutorial.testing.car.Car

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(400))
            .build()

        car = component.getCar()
        car.drive()
    }
}
