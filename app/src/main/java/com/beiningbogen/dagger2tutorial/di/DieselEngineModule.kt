package com.beiningbogen.dagger2tutorial.di

import com.beiningbogen.dagger2tutorial.testing.car.engine.DieselEngine
import com.beiningbogen.dagger2tutorial.testing.car.engine.Engine
import dagger.Module
import dagger.Provides


@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}










/*
 @Module
abstract class DieselEngineModule {

    // @Binds
    @Provides
    abstract fun bindEngine(engine: DieselEngine): Engine
}
 */
