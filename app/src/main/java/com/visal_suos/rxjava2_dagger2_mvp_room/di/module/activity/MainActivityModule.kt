package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity

import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainPresenterImpl
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity.MainActivity

import com.visal_suos.rxjava2_dagger2_mvp_room.di.scope.ActivityScope
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

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
    fun provideMainPresenter(mainView: MainView, networkUtils: NetworkUtils, apiService: ApiService): MainPresenter {
        return MainPresenterImpl(mainView, networkUtils, apiService)
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit : Retrofit) : ApiService{
        return retrofit.create(ApiService::class.java)
    }
}