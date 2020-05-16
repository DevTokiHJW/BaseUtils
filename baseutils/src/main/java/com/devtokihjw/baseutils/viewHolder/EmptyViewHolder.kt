package com.devtokihjw.baseutils.viewHolder

import android.view.ViewGroup

class EmptyViewHolder(viewGroup: ViewGroup) : BaseViewHolder<EmptyViewHolderData>(viewGroup) {
    override fun init() {

    }

    override fun bindViewHolder(data: EmptyViewHolderData, lambda: (Pair<Any, Any?>) -> Any?) {

    }
}