package com.visal_suos.core.di

import android.app.Application

/**
 * Created by v.suos on 2/12/2018.
 */
abstract class CoreApp : Application(){

    abstract fun getBaseURL() : String

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    abstract fun initDagger();

}