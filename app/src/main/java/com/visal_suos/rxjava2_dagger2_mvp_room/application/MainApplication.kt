package com.visal_suos.rxjava2_dagger2_mvp_room.application

import android.app.Activity
import android.app.Application
import com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


/**
 * Created by v.suos on 2/12/2018.
 */
class MainApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = activityInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
                .application(this)
                .build().inject(this)
    }
}