package com.devtokihjw.baseutils.dialogFragment

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.devtokihjw.baseutils.BaseViewModel

class DialogFragmentViewModel(baseApplication: Application) : BaseViewModel(baseApplication) {

    val dismissLiveData = MutableLiveData<Boolean?>()

    fun clearDismissLiveDataValue() {
        dismissLiveData.value = null
    }
}