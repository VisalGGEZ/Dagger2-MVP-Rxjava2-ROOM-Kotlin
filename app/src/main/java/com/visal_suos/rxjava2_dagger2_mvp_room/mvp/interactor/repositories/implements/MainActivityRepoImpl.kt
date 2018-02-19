package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.implements

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.dao.TestDao
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.entity.DataTestEntity
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.MainActivityRepo
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.callbacks.MainActivityCallback
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by v.suos on 2/19/2018.
 */
class MainActivityRepoImpl(private val networkUtils: NetworkUtils, private val apiService: ApiService, private val testDao: TestDao) : MainActivityRepo {

    lateinit var mainActivityCallback: MainActivityCallback

    override fun setListener(mainActivityCallback: MainActivityCallback) {
        this.mainActivityCallback = mainActivityCallback
    }

    override fun getDataTest() {
        var insert = Maybe.create<LongArray> {
            try {
                it.onSuccess(testDao.insert(DataTestEntity("4", "4", "4", "4")))
                it.onComplete()
            } catch (e: Throwable) {
                it.onError(e)
            }
        }

        insert.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    var test = it
                }

//        if (networkUtils.isNetAvailable) {
//            apiService.getDataTest().subscribeOn(Schedulers.newThread())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(
//                            { it -> mainActivityCallback.onDataTestLoaded(it) },
//                            { er -> mainActivityCallback.onDataError(er.toString()) })
//        }
    }

}