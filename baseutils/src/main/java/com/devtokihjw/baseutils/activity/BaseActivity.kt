package com.devtokihjw.baseutils.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseutils.BaseViewModel

abstract class BaseActivity(private val layoutResId: Int) : AppCompatActivity() {

    abstract val viewModel: ActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)
    }

    override fun onStart() {
        super.onStart()
        observeLiveData()
    }

    override fun onStop() {
        super.onStop()
        removeObserverLiveData()
    }

    abstract fun observeLiveData()

    abstract fun removeObserverLiveData()
}