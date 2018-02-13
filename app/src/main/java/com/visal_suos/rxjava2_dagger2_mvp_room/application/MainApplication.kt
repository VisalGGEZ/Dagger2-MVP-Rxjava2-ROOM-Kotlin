package com.visal_suos.rxjava2_dagger2_mvp_room.application

import android.app.Application
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity.AppComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity.DaggerAppComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity.AppModule


/**
 * Created by v.suos on 2/12/2018.
 */
class MainApplication : Application() {

    private val baseURL = "https://raw.githubusercontent.com/VisalGGEZ/udemy-forum/master/"

    companion object {
        @JvmStatic
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    fun initDagger() {
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this, baseURL))
                .build()
    }
}