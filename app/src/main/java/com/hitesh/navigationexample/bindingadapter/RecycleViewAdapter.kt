package com.hitesh.navigationexample.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hitesh.navigationexample.modules.home.UserAdapter
import com.hitesh.navigationexample.modules.home.model.User


@BindingAdapter("userList")
fun seUserList(view: RecyclerView, data: ArrayList<User>?) {
    data?.let {
        (view.adapter as UserAdapter).updateUserList(it)
    }
}