package com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity

import android.os.Bundle
import com.visal_suos.rxjava2_dagger2_mvp_room.R
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity.DaggerMainActivityComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity.MainActivityModule
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.model.DataTestModel
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainActivityPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var mainPresenter: MainActivityPresenter

    override fun initDagger() {
        DaggerMainActivityComponent
                 .builder().appComponent(getComponent())
                .mainActivityModule(MainActivityModule(this))
                .build().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.getDataTest()
    }

    override fun onDataTestLoaded(dataTest: List<DataTestModel>) {

    }
}