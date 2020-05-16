package com.devtokihjw.baseutils.utils

import android.annotation.SuppressLint
import android.util.Log

var enableLog = true

fun Any.className() = javaClass.simpleName

@SuppressLint("LogNotTimber")
fun printLog(tag: String, any: Any?) {
    if (enableLog) {
        Log.e(tag, "$any")
    }
}

fun Any?.isNotNull() = this != null