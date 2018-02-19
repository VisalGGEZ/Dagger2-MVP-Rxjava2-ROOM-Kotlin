package com.visal_suos.rxjava2_dagger2_mvp_room.di.builder

import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity.MainActivityModule
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by v.suos on 2/19/2018.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity() : MainActivity

}