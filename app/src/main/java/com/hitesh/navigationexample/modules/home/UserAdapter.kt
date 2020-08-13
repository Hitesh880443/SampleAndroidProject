package com.hitesh.navigationexample.modules.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hitesh.navigationexample.R
import com.hitesh.navigationexample.databinding.RowUserBinding
import com.hitesh.navigationexample.modules.home.model.User

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var userList: ArrayList<User> = ArrayList()

    fun updateUserList(userList: ArrayList<User>) {
        this.userList = userList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding: RowUserBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.row_user, parent, false
        )
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    inner class UserViewHolder(private val userBinding: RowUserBinding) :
        RecyclerView.ViewHolder(userBinding.root) {
        fun bind(user: User) {
            userBinding.user = user
            userBinding.executePendingBindings()
        }
    }
}