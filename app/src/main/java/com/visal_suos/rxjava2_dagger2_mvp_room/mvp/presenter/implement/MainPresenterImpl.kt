package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils

/**
 * Created by v.suos on 2/8/2018.
 */
class MainPresenterImpl (private val mainView: MainView, private val networkUtils: NetworkUtils, private val apiService: ApiService) : MainPresenter{

    override fun getDataTest() {
        if (networkUtils.isNetAvailable){

        }
    }
}