package com.devtokihjw.baseutils.bottomSheetDialogFragment

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.devtokihjw.baseutils.BaseViewModel

abstract class BottomSheetDialogFragmentViewModel(baseApplication: Application) : BaseViewModel(baseApplication){

    val dismissLiveData = MutableLiveData<Boolean?>()

    fun clearDismissLiveDataValue() {
        dismissLiveData.value = null
    }
}