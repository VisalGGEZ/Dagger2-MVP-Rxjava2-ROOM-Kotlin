package com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity

import android.support.v7.app.AppCompatActivity
import com.visal_suos.rxjava2_dagger2_mvp_room.application.MainApplication
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.AppComponent

/**
 * Created by v.suos on 2/10/2018.
 */
abstract class BaseActivity : AppCompatActivity() {

    init {
        initDagger()
    }

    protected fun getComponent() = MainApplication.appComponent

    abstract fun initDagger();

}