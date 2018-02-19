package com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.visal_suos.core.extensions.loadUrl

import com.visal_suos.rxjava2_dagger2_mvp_room.R
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.SimpleView
import kotlinx.android.synthetic.main.fragment_simple.*


/**
 * A simple [Fragment] subclass.
 */
class SimpleFragment : Fragment(), SimpleView {

//    @Inject lateinit var simpleFragmentPresenter: SimpleFragmentPresenter


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        simpleFragmentPresenter.getData()
    }

    override fun onDataLoaded(img: String) {
        imgSimple.loadUrl(img)
    }

}
