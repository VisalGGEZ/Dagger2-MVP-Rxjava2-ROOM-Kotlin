package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.callbacks

import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.models.DataTestModel

/**
 * Created by v.suos on 2/19/2018.
 */
interface MainActivityCallback {
    fun onDataTestLoaded(dataTest: List<DataTestModel>);
    fun onDataError(error: String)
}