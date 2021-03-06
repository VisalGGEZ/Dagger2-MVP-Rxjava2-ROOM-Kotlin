package com.visal_suos.core.di.module

import android.content.Context
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
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
    fun provideRetrofit(@Named("ok-1") client: OkHttpClient, converterFactory: GsonConverterFactory, adapterFactory: RxJava2CallAdapterFactory, @Named("BASE_URL") baseURL : String): Retrofit {
        return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(adapterFactory)
                .client(client)
                .build()
    }

}