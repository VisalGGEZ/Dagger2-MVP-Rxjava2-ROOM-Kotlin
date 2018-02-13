package com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.visal_suos.rxjava2_dagger2_mvp_room.R
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.SimpleView


/**
 * A simple [Fragment] subclass.
 */
class SimpleFragment : BaseFragment(), SimpleView {

    override fun initDagger() {

    }

    override fun setView() = R.layout.fragment_simple

    override fun onDataLoaded(img: String) {

    }

}
