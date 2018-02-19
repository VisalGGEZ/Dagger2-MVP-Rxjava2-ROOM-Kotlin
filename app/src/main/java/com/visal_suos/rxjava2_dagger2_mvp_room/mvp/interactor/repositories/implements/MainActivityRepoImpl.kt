package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.implements

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.MainActivityRepo
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.callbacks.MainActivityCallback
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by v.suos on 2/19/2018.
 */
class MainActivityRepoImpl(private val networkUtils: NetworkUtils, private val apiService: ApiService) : MainActivityRepo {

    lateinit var mainActivityCallback: MainActivityCallback

    override fun setListener(mainActivityCallback: MainActivityCallback) {
        this.mainActivityCallback = mainActivityCallback
    }

    override fun getDataTest() {
        if (networkUtils.isNetAvailable) {
            apiService.getDataTest().subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            { it -> mainActivityCallback.onDataTestLoaded(it) },
                            { er -> mainActivityCallback.onDataError(er.toString()) })
        }
    }

}