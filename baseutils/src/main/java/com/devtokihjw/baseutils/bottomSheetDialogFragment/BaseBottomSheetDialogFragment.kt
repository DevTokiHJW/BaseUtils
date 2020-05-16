package com.devtokihjw.baseutils.bottomSheetDialogFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseutils.BaseViewModel
import com.devtokihjw.baseutils.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomSheetDialogFragment(private val layoutResId: Int) : BottomSheetDialogFragment() {

    abstract val viewModel: BottomSheetDialogFragmentViewModel

    private val bottomSheetCallback by lazy {
        object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> dismiss() // 不在畫面上時，關掉SheetDialogFragment
                    else -> {
                    }
                }
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutResId, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        BottomSheetBehavior.from(requireDialog().findViewById<FrameLayout>(R.id.design_bottom_sheet)).run {
            state = BottomSheetBehavior.STATE_EXPANDED
            peekHeight = 0
            addBottomSheetCallback(bottomSheetCallback)
        }
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

    inline fun <reified T : BaseViewModel> getViewModel() = ViewModelProvider(requireActivity())[T::class.java]
}