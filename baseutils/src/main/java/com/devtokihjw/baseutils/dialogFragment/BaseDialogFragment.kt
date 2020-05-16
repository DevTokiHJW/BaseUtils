package com.devtokihjw.baseutils.dialogFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseutils.BaseViewModel

abstract class BaseDialogFragment(private val layoutResId: Int) : DialogFragment() {

    abstract val viewModel: DialogFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutResId, container, false)
    }

    override fun onStart() {
        super.onStart()
        observeLiveData()
    }

    override fun onResume() {
        super.onResume()
        setWindow()
    }

    override fun onStop() {
        super.onStop()
        removeObserverLiveData()
    }

    private fun setWindow() {
        dialog?.window?.let { mWindow ->
            val mLayoutParams = mWindow.attributes
            mLayoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
            mLayoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
            mWindow.attributes = mLayoutParams
        }
    }

    abstract fun observeLiveData()

    abstract fun removeObserverLiveData()

    inline fun <reified T : BaseViewModel> getViewModel() = ViewModelProvider(requireActivity())[T::class.java]
}