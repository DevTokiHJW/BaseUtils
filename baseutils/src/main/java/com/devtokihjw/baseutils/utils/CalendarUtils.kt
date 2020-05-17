package com.devtokihjw.baseutils.utils

import java.text.SimpleDateFormat
import java.util.*

fun Long.toyyyyMMddHHmmss() = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(Calendar.getInstance().apply { timeInMillis = this@toyyyyMMddHHmmss }.time)

fun Long.toyyyyMMdd() = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(Calendar.getInstance().apply { timeInMillis = this@toyyyyMMdd }.time)

fun Long.toHHmm() = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Calendar.getInstance().apply { timeInMillis = this@toHHmm }.time)