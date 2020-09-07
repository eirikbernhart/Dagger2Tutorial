package com.beiningbogen.dagger2tutorial.di

import com.beiningbogen.dagger2tutorial.testing.car.engine.Engine
import com.beiningbogen.dagger2tutorial.testing.car.engine.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}
