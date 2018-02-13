package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.SimpleFragmentPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.SimpleView
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils

/**
 * Created by v.suos on 2/13/2018.
 */
class SimpleFragmentPresenterImpl(private val simpleView: SimpleView, apiService: ApiService, networkUtils: NetworkUtils) : SimpleFragmentPresenter {

    override fun getData() {

    }
}