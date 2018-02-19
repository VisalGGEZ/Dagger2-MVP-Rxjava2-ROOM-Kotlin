package com.visal_suos.rxjava2_dagger2_mvp_room.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.visal_suos.rxjava2_dagger2_mvp_room.R
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.models.DataTestModel
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.presenter.implement.MainActivityPresenter
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view.MainView
import com.visal_suos.rxjava2_dagger2_mvp_room.ui.fragment.SimpleFragment
import dagger.android.AndroidInjection
import io.github.mgarciaguerrero.safefragments.extensions.addFragmentSafelfy
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject
    lateinit var mainPresenter: MainActivityPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.getDataTest()
//        addFragment()
    }

    private fun addFragment() {
        addFragmentSafelfy(fragment = SimpleFragment(), tag = "FRAGMENT_ONE", containerViewId = R.id.myContent)
    }

    override fun onDataTestLoaded(dataTest: List<DataTestModel>) {
        txtTestCount.text = "total data fetch ${dataTest.size} items."
    }

    override fun onDataError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}