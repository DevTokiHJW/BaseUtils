package com.devtokihjw.baseutils.viewHolder

import android.view.ViewGroup

class EmptyViewHolder(viewGroup: ViewGroup) : BaseViewHolder<EmptyViewHolderData>(viewGroup) {

    override fun onBindViewHolder(data: EmptyViewHolderData, lambda: (Pair<Any, Any?>) -> Any?) {

    }
}