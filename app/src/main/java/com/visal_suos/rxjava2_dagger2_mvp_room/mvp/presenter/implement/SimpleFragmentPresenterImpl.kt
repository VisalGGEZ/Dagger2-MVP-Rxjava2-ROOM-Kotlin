package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.SimpleFragmentPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.SimpleView
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 * Created by v.suos on 2/13/2018.
 */
class SimpleFragmentPresenterImpl(private val simpleView: SimpleView, private val apiService: ApiService, private val networkUtils: NetworkUtils) : SimpleFragmentPresenter {

    override fun getData() {
        if (networkUtils.isNetAvailable){
            apiService.getImage()
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(Consumer { simpleView.onDataLoaded(it) })
        }
    }
}