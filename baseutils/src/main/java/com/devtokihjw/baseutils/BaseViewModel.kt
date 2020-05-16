package com.devtokihjw.baseutils

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

abstract class BaseViewModel(private val baseApplication: Application) : AndroidViewModel(baseApplication) {

    val snackBarLiveData = MutableLiveData<String?>()

    fun clearSnackBarLiveDataValue() {
        snackBarLiveData.value = null
    }

    fun getString(resId: Int) = baseApplication.getString(resId)
}