package com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.visal_suos.core.extensions.loadUrl

import com.visal_suos.rxjava2_dagger2_mvp_room.R
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.fragment.DaggerSimpleFragmentComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.fragment.SimpleFragmentModule
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.SimpleFragmentPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.SimpleView
import kotlinx.android.synthetic.main.fragment_simple.*
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 */
class SimpleFragment : BaseFragment(), SimpleView {

    @Inject lateinit var simpleFragmentPresenter: SimpleFragmentPresenter

    override fun initDagger() {
        DaggerSimpleFragmentComponent.builder()
                .appComponent(getComponent())
                .simpleFragmentModule(SimpleFragmentModule(this))
                .build().inject(this)
    }

    override fun setView() = R.layout.fragment_simple

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        simpleFragmentPresenter.getData()
    }

    override fun onDataLoaded(img: String) {
        imgSimple.loadUrl(img)
    }

}
