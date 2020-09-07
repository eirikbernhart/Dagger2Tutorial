package com.beiningbogen.dagger2tutorial.di

import com.beiningbogen.dagger2tutorial.testing.car.emulateexternallibrary.Rims
import com.beiningbogen.dagger2tutorial.testing.car.emulateexternallibrary.Tires
import com.beiningbogen.dagger2tutorial.testing.car.emulateexternallibrary.Wheels
import dagger.Module
import dagger.Provides

@Module
abstract class WheelsModule {

    companion object {
        @Provides
        fun provideRims() : Rims {
            return Rims()
        }

        @Provides
        fun provideTires() : Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires) : Wheels {
            return Wheels(rims, tires)
        }
    }
}
