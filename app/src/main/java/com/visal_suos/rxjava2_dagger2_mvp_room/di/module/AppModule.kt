package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity

import android.app.Application
import android.content.Context
import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by v.suos on 2/8/2018.
 */
@Module
class AppModule(private val app: Application, private val baseURL: String) {

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
    fun provideApiService(retrofit : Retrofit) : ApiService{
        return retrofit.create(ApiService::class.java)
    }
}