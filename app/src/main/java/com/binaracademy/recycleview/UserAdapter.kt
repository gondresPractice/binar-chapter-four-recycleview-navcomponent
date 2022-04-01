package com.binaracademy.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.binaracademy.recycleview.data.User
import com.binaracademy.recycleview.fragment.FragmentDetail
import com.binaracademy.recycleview.fragment.FragmentMain
import com.binaracademy.recycleview.fragment.FragmentMainDirections

class UserAdapter(private val user : List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){


        val tvName :TextView = view.findViewById<TextView>(R.id.tvName)
        val tvPhone  :TextView= view.findViewById<TextView>(R.id.tvPhone)
        val tvAddress :TextView = view.findViewById<TextView>(R.id.tvAddress)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycle,parent,false)

        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.tvName.text = user[position].name
        holder.tvPhone.text = user[position].phone.toString()
        holder.tvAddress.text = user[position].address


        holder.itemView.setOnClickListener{
            var name = user[position].name.toString()
            var phone = user[position].phone.toString()
            var address = user[position].address.toString()
            it.findNavController().navigate(FragmentMainDirections.actionFragmentMainToFragmentDetail(name,phone.toInt(),address));
        }

    }

    override fun getItemCount(): Int {
       return user.size
    }
}