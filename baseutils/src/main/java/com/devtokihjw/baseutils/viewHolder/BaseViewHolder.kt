package com.devtokihjw.baseutils.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<D : ViewHolderData>(view: View) : RecyclerView.ViewHolder(view) {

    fun onBindViewHolder(data: D, lambda: (Pair<Any, Any?>) -> Any?) {
        init()
        bindViewHolder(data, lambda)
    }

    abstract fun bindViewHolder(data: D, lambda: (Pair<Any, Any?>) -> Any?)

    abstract fun init()

    fun getString(resId: Int) = itemView.context.getString(resId)
}