package com.visal_suos.rxjava2_dagger2_mvp_room.data.room.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by v.suos on 2/13/2018.
 */
@Entity(tableName = "test")
class DataTestEntity(@field:ColumnInfo(name = "attack_type") var attackType: String?,
                     @field:ColumnInfo(name = "img") var img: String?,
                     @field:ColumnInfo(name = "localized_name") var localizedName: String?,
                     @field:ColumnInfo(name = "primary_attr") var primaryAttr: String?) {

    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0
}
