package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories

import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.callbacks.MainActivityCallback

/**
 * Created by v.suos on 2/19/2018.
 */
interface MainActivityRepo{
    fun getDataTest()

    fun setListener(mainActivityCallback: MainActivityCallback)
}
