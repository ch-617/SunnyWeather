package com.ihunuo.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "4tC8N54eYWsMnjBa"
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}