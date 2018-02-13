package com.visal_suos.rxjava2_dagger2_mvp_room.di.module

import android.arch.persistence.room.Room
import android.content.Context
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.db.MyDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by v.suos on 2/13/2018.
 */
@Module
class DBModule {
    @Singleton
    @Provides
    fun provideMyDatabase(application: Context): MyDatabase {
        return Room.databaseBuilder(application, MyDatabase::class.java!!, "my-db").build()
    }
}