package com.visal_suos.rxjava2_dagger2_mvp_room.di.component.activity

import com.visal_suos.core.di.module.NetworkModule
import com.visal_suos.core.di.module.OkHttpClientModule
import com.visal_suos.core.di.module.RetrofitModule
import com.visal_suos.rxjava2_dagger2_mvp_room.application.MainApplication
import com.visal_suos.rxjava2_dagger2_mvp_room.di.builder.ActivityBuilder
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.DBModule
import com.visal_suos.rxjava2_dagger2_mvp_room.di.module.activity.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by v.suos on 2/8/2018.
 */
@Singleton
@Component(modules = arrayOf(
        ActivityBuilder::class,
        AndroidInjectionModule::class,
        AppModule::class,
        OkHttpClientModule::class,
        RetrofitModule::class,
        NetworkModule::class,
        DBModule::class))
interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: MainApplication): Builder

        fun build(): AppComponent
    }

    fun inject(application: MainApplication)
}