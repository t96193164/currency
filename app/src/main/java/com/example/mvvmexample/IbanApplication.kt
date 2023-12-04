package com.example.mvvmexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class IbanApplication: Application() {



    companion object {
        private var application: IbanApplication? = null

        fun getApp(): IbanApplication? {
            return application
        }
    }



    override fun onCreate() {
        try {
            application = this
            super.onCreate()


        } catch (e: IllegalStateException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


}