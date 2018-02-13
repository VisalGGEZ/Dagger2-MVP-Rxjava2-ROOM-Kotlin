package com.visal_suos.core.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by v.suos on 2/13/2018.
 */
fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).into(this)
}

fun ImageView.loadLocal(url: Int) {
    Glide.with(context).load(url).into(this)
}
