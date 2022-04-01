package com.binaracademy.recycleview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binaracademy.recycleview.R
import com.binaracademy.recycleview.UserAdapter
import com.binaracademy.recycleview.data.User


class FragmentMain : Fragment() {

    private var layoutManager : RecyclerView.LayoutManager ? = null
    private var adapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>?=null
    private lateinit var rvUser : RecyclerView
//    private lateinit var tvtE : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        rvUser = view.findViewById(R.id.rvUser)
        val userList = listOf(
            User(
                "Andreas Happy",622314123,"Tangerang"
            ),
            User(
                "Agung Hermansyah",62314123,"Jakarta"
            ),
            User(
                "Adjis Doa Ibu",62314123,"Depok"
            ),
            User(
                "Hizkia Vigo",2314123,"Cirebon"
            ),
            User(
                "Andreas Happy",622314123,"Tangerang"
            ),
            User(
                "Agung Hermansyah",62314123,"Jakarta"
            ),
            User(
                "Adjis Doa Ibu",62314123,"Depok"
            ),
            User(
                "Hizkia Vigo",2314123,"Cirebon"
            ),
            User(
                "Andreas Happy",622314123,"Tangerang"
            ),
            User(
                "Agung Hermansyah",62314123,"Jakarta"
            ),
            User(
                "Adjis Doa Ibu",62314123,"Depok"
            ),
            User(
                "Hizkia Vigo",2314123,"Cirebon"
            )
        )

        val adapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rvUser.layoutManager = layoutManager
        rvUser.adapter = adapter

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

}