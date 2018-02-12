package com.visal_suos.rxjava2_dagger2_mvp_room.application

import android.app.Application
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.AppComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.DaggerAppComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.base.AppModule


/**
 * Created by v.suos on 2/12/2018.
 */
class MainApplication : Application() {

    private val baseURL = "https://stackoverflow.com/questions/43756498/dagger-2-component-not-generated"

    companion object {
        @JvmStatic
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    fun initDagger() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this, baseURL)).build()
    }
}