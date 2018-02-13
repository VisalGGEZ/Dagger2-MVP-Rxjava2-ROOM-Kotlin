package com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.visal_suos.rxjava2_dagger2_mvp_room.R
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity.DaggerMainActivityComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity.MainActivityModule
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.model.DataTestModel
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainActivityPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment.SimpleFragment
import io.github.mgarciaguerrero.safefragments.extensions.addFragmentSafelfy
import kotlinx.android.synthetic.main.activity_main.*
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
        addFragment()
    }

    private fun addFragment() {
        addFragmentSafelfy(fragment = SimpleFragment(), tag = "FRAGMENT_ONE", containerViewId = R.id.myContent)
    }

    override fun onDataTestLoaded(dataTest: List<DataTestModel>) {
        txtTestCount.text = "total data fetch ${dataTest.size} items."
    }

    override fun onDataError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}