package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.base

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by v.suos on 2/12/2018.
 */
@Module
class OkHttpClientModule {
    @Singleton
    @Provides
    @Named("ok-1")
    fun provideOkHttpClient1(): OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build()
    }

    @Singleton
    @Provides
    @Named("ok-2")
    fun provideOkHttpClient2(): OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build()
    }
}