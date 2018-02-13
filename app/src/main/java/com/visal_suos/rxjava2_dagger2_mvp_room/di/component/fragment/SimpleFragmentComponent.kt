package com.visal_suos.rxjava2_dagger2_mvp_room.di.component.fragment

import com.visal_suos.core.di.scope.FragmentScope
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity.AppComponent
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.fragment.SimpleFragmentModule
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment.SimpleFragment
import dagger.Component

/**
 * Created by v.suos on 2/13/2018.
 */
@FragmentScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(SimpleFragmentModule::class))
interface SimpleFragmentComponent{
    fun inject(simpleFragment : SimpleFragment)
}