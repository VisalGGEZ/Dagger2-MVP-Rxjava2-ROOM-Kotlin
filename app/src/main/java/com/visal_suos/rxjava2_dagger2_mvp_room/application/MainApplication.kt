package com.visal_suos.rxjava2_dagger2_mvp_room.application

import com.visal_suos.core.di.CoreApp
import com.visal_suos.core.di.component.AppComponent
import com.visal_suos.core.di.component.DaggerAppComponent
import com.visal_suos.core.di.module.AppModule


/**
 * Created by v.suos on 2/12/2018.
 */
class MainApplication : CoreApp() {

    override fun getBaseURL() = "https://stackoverflow.com/questions/43756498/dagger-2-component-not-generated"

    companion object {
        @JvmStatic
        lateinit var appComponent: AppComponent
    }

    override fun initDagger() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this, getBaseURL())).build()
    }
}