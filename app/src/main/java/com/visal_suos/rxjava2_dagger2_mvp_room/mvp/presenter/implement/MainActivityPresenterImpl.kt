package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement

import android.widget.Toast
import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by v.suos on 2/8/2018.
 */
class MainActivityPresenterImpl(private val mainView: MainView, private val networkUtils: NetworkUtils, private val apiService: ApiService) : MainActivityPresenter {

    override fun getDataTest() {
        if (networkUtils.isNetAvailable){
            apiService.getDataTest().subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            {it->mainView.onDataTestLoaded(it)},
                            {er->mainView.onDataError(er.toString())})
        }
    }
}