package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.base

import android.content.Context
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import com.visal_suos.rxjava2_dagger2_mvp_room.application.MainApplication
import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by v.suos on 2/8/2018.
 */
@Module
class AppModule(private val app: MainApplication, private val baseURL: String) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return app.applicationContext
    }

    @Provides
    @Singleton
    @Named("BASE_URL")
    fun provideBaseURL() = baseURL

    @Singleton
    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRxJavaCallAdapterFactory(): RxJava2CallAdapterFactory {
        return RxJava2CallAdapterFactory.create()
    }

    @Singleton
    @Provides
    fun provideNetworkUtils(context: Context): NetworkUtils {
        return NetworkUtils(context = context)
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit : Retrofit) : ApiService{
        return retrofit.create(ApiService::class.java)
    }

}