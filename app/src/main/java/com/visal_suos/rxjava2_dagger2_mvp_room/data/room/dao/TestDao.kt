package com.visal_suos.rxjava2_dagger2_mvp_room.data.room.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.entity.DataTestEntity
import io.reactivex.Maybe

/**
 * Created by v.suos on 2/13/2018.
 */
@Dao
interface TestDao {
    @Query("SELECT * FROM hero")
    abstract fun getAll(): Maybe<List<DataTestEntity>>

    @Query("SELECT COUNT(*) FROM hero")
    abstract fun count(): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(vararg heroes: DataTestEntity): LongArray // vararg = (hero, hero, hero)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insertAsList(heroes: List<DataTestEntity>): LongArray
}