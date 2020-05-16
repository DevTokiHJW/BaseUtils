package com.devtokihjw.baseutils.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseutils.BaseViewModel
import com.devtokihjw.baseutils.activity.ActivityViewModel

abstract class BaseFragment(contentLayoutId: Int) : Fragment(contentLayoutId) {

    abstract val viewModel: FragmentViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setOnClickListener()
    }

    override fun onStart() {
        super.onStart()
        observeLiveData()
    }

    override fun onStop() {
        super.onStop()
        removeObserverLiveData()
    }

    abstract fun setOnClickListener()

    abstract fun observeLiveData()

    abstract fun removeObserverLiveData()

    inline fun <reified T : BaseViewModel> getViewModel() = ViewModelProvider(requireActivity())[T::class.java]
}