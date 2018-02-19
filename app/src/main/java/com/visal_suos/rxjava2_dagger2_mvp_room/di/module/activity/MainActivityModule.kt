package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.dao.TestDao
import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.db.MyDatabase
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainActivityPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainActivityPresenterImpl
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity.MainActivity

import com.visal_suos.rxjava2_dagger2_mvp_room.di.scope.ActivityScope
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.MainActivityRepo
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.repositories.implements.MainActivityRepoImpl
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import dagger.Module
import dagger.Provides

/**
 * Created by v.suos on 2/8/2018.
 */
@Module
class MainActivityModule {

    @Provides
    fun provideMainView(activity: MainActivity): MainView {
        return activity
    }

    @Provides
    fun provideMainPresenter(mainView: MainView, mainActivityRepo: MainActivityRepo): MainActivityPresenter {
        return MainActivityPresenterImpl(mainView, mainActivityRepo)
    }

    @Provides
    fun provideMainRepository(networkUtils: NetworkUtils, apiService: ApiService, testDao: TestDao) : MainActivityRepo{
        return MainActivityRepoImpl(networkUtils = networkUtils, apiService = apiService, testDao = testDao)
    }

    @Provides
    fun provideTestDao(myDatabase: MyDatabase) : TestDao{
        return myDatabase.testDao()
    }

}