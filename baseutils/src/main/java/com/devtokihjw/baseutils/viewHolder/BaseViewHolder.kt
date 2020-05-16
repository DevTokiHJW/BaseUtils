package com.devtokihjw.baseutils.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<D : ViewHolderData>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun onBindViewHolder(data: D, lambda: (Pair<Any, Any?>) -> Any?)
}