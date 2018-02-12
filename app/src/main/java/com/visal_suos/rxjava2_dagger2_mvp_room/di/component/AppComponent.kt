package com.visal_suos.rxjava2_dagger2_mvp_room.di.component

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.base.AppModule
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.base.OkHttpClientModule
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.base.RetrofitModule
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by v.suos on 2/8/2018.
 */
@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        OkHttpClientModule::class,
        RetrofitModule::class))
interface AppComponent {
    fun retrofit(): Retrofit
    fun networkUtils(): NetworkUtils
    fun apiService() : ApiService
}