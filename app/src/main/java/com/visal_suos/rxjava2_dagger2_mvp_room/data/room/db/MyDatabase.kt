package com.visal_suos.rxjava2_dagger2_mvp_room.data.room.db

import android.arch.persistence.db.SupportSQLiteOpenHelper
import android.arch.persistence.room.Database
import android.arch.persistence.room.DatabaseConfiguration
import android.arch.persistence.room.InvalidationTracker
import android.arch.persistence.room.RoomDatabase

import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.dao.TestDao
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.entity.DataTestEntity

/**
 * Created by v.suos on 2/7/2018.
 */
@Database(entities = arrayOf(DataTestEntity::class), version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {

    abstract fun testDao(): TestDao

    override fun createOpenHelper(config: DatabaseConfiguration): SupportSQLiteOpenHelper? {
        return null
    }

    override fun createInvalidationTracker(): InvalidationTracker? {
        return null
    }
}

