package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement

import android.widget.Toast
import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.models.DataTestModel
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.MainActivityRepo
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.implements.MainActivityRepoImpl
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.callbacks.MainActivityCallback
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by v.suos on 2/8/2018.
 */
class MainActivityPresenterImpl(private val mainView: MainView, private val mainActivityRepo: MainActivityRepo) : MainActivityPresenter, MainActivityCallback {

    init {
        mainActivityRepo.setListener(this)
    }

    override fun onDataTestLoaded(dataTest: List<DataTestModel>) {
        mainView.onDataTestLoaded(dataTest)
    }

    override fun onDataError(error: String) {
        mainView.onDataError(error)
    }

    override fun getDataTest() {
        mainActivityRepo.getDataTest()
    }
}