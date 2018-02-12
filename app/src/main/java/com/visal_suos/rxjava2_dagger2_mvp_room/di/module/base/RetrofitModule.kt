package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.base

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by v.suos on 2/12/2018.
 */
@Module
class RetrofitModule {

    @Singleton
    @Provides
    fun provideRetrofit(@Named("ok-1") client: OkHttpClient, converterFactory: GsonConverterFactory, adapterFactory: RxJava2CallAdapterFactory, @Named("BASE_URL") baseURL : String): Retrofit {
        return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(adapterFactory)
                .client(client)
                .build()
    }

}