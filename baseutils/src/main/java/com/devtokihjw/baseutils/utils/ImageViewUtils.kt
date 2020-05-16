package com.devtokihjw.baseutils.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.loadUrlCircleCropTransform(url: String) {
    Glide.with(context)
            .load(url)
            .apply(RequestOptions.circleCropTransform())
            .into(this)
}

fun ImageView.loadUrl(url: String) {
    Glide.with(context)
            .load(url)
            .into(this)
}