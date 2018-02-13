package com.visal_suos.rxjava2_dagger2_mvp_room.di.module.fragment

import com.visal_suos.core.di.scope.FragmentScope
import com.visal_suos.rxjava2_dagger2_mvp_room.data.api.ApiService
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.SimpleFragmentPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.SimpleFragmentPresenterImpl
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.SimpleView
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment.SimpleFragment
import com.visal_suos.rxjava2_dagger2_mvp_room.utilities.NetworkUtils
import dagger.Module
import dagger.Provides

/**
 * Created by v.suos on 2/13/2018.
 */
@FragmentScope
@Module
class SimpleFragmentModule(private val simpleFragment: SimpleFragment) {

    @Provides
    fun provideSimpleView(): SimpleView {
        return simpleFragment
    }

    @Provides
    fun provideSimpleFragment(simpleView: SimpleView, apiService: ApiService, networkUtils: NetworkUtils): SimpleFragmentPresenter {
        return SimpleFragmentPresenterImpl(simpleView = simpleView, apiService = apiService, networkUtils = networkUtils)
    }

}