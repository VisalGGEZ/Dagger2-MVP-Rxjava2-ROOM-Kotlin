package com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment

import android.support.v4.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.visal_suos.rxjava2_dagger2_mvp_room.application.MainApplication

/**
 * Created by v.suos on 2/13/2018.
 */
abstract class BaseFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        initDagger()
    }

    protected fun getComponent() = MainApplication.appComponent

    abstract fun initDagger();

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(setView(), container, false)
    }

    abstract fun setView(): Int
}