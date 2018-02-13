package com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity

import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity.MainActivityModule
import com.visal_suos.rxjava2_dagger2_mvp_room.di.scope.ActivityScope
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity.MainActivity
import dagger.Component

/**
 * Created by v.suos on 2/8/2018.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent{
    fun inject(activity: MainActivity)
}