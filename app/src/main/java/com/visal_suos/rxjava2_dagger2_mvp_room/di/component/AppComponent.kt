package com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity

import com.visal_suos.core.di.module.NetworkModule
import com.visal_suos.core.di.module.OkHttpClientModule
import com.visal_suos.core.di.module.RetrofitModule
import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.DBModule
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity.AppModule
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import dagger.Component
import okhttp3.OkHttpClient
import javax.inject.Singleton

/**
 * Created by v.suos on 2/8/2018.
 */
@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        OkHttpClientModule::class,
        RetrofitModule::class,
        NetworkModule::class,
        DBModule::class))
interface AppComponent {

    fun networkUtils() : NetworkUtils
    fun apiService() : ApiService

}