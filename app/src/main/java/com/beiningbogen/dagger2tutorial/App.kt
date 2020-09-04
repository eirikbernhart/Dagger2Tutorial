package com.beiningbogen.dagger2tutorial

import android.app.Application
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }
}

/*
class BaseApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }


    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }
}

 */
