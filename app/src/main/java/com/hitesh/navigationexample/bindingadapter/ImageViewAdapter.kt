package com.hitesh.navigationexample.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hitesh.navigationexample.R


@BindingAdapter("avatar")
fun setAvatar(view: ImageView, url: String?) {
    url?.let {
        Glide
            .with(view.context)
            .load(url)
            .centerCrop()
            .placeholder(R.drawable.icon_placeholder)
            .apply(RequestOptions().circleCrop())
            .into(view)
    }
}