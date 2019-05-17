package com.androidanalytics.eventtrack

import android.app.Application
import com.eventlibrary.TrackerManager

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initSingletons()
    }

    private fun initSingletons() {
        TrackerManager.init(this)
    }
}
