package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.dao.TestDao
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.db.MyDatabase
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainActivityPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainActivityPresenterImpl
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity.MainActivity

import com.visal_suos.rxjava2_dagger2_mvp_room.di.scope.ActivityScope
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import dagger.Module
import dagger.Provides

/**
 * Created by v.suos on 2/8/2018.
 */
@Module
class MainActivityModule(val activity: MainActivity) {

    @ActivityScope
    @Provides
    fun provideMainView(): MainView {
        return activity
    }

    @ActivityScope
    @Provides
    fun provideMainPresenter(mainView: MainView, networkUtils: NetworkUtils, apiService: ApiService): MainActivityPresenter {
        return MainActivityPresenterImpl(mainView, networkUtils, apiService)
    }

    @ActivityScope
    @Provides
    fun provideTestDao(myDatabase: MyDatabase) : TestDao{
        return myDatabase.testDao()
    }

}