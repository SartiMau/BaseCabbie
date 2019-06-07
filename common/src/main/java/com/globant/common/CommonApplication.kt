package com.globant.common

import android.app.Application
import android.util.Log

open class CommonApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        Log.d("CommonApplication", "CommonApplication created")
    }

    companion object {
        lateinit var instance: CommonApplication
    }
}