package com.beiningbogen.dagger2tutorial.di

import com.beiningbogen.dagger2tutorial.testing.car.engine.DieselEngine
import com.beiningbogen.dagger2tutorial.testing.car.engine.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}
