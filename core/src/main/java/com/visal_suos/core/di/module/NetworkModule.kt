package com.visal_suos.core.di.module

import android.content.Context
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by v.suos on 2/13/2018.
 */
@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideNetworkUtils(context: Context): NetworkUtils {
        return NetworkUtils(context = context)
    }
}