package com.visal_suos.rxjava2_dagger2_mvp_room.data.api

import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.model.DataTestModel
import io.reactivex.Maybe
import retrofit2.http.GET

/**
 * Created by v.suos on 2/9/2018.
 */
interface ApiService {
    @GET("shortheroes.json")
    fun getDataTest(): Maybe<List<DataTestModel>>
}