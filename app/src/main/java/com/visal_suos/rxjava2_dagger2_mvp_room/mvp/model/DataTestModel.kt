package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by v.suos on 2/9/2018.
 */
class DataTestModel {
    @SerializedName("attack_type")
    var attackType: String? = null
    @SerializedName("img")
    var img: String? = null
    @SerializedName("localized_name")
    var localizedName: String? = null
    @SerializedName("primary_attr")
    var primaryAttr: String? = null
}