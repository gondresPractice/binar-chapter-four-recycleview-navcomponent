package com.binaracademy.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binaracademy.recycleview.data.User

class MainActivity : AppCompatActivity() {

    lateinit var rvUser : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        rvUser = findViewById(R.id.rvUser)
//        val userList = listOf(
//            User(
//                "Andreas Happy",622314123,"Tangerang"
//            ),
//            User(
//                "Agung Hermansyah",62314123,"Jakarta"
//            ),
//            User(
//                "Adjis Doa Ibu",62314123,"Depok"
//            ),
//            User(
//                "Hizkia Vigo",2314123,"Cirebon"
//            ),
//            User(
//                "Andreas Happy",622314123,"Tangerang"
//            ),
//            User(
//                "Agung Hermansyah",62314123,"Jakarta"
//            ),
//            User(
//                "Adjis Doa Ibu",62314123,"Depok"
//            ),
//            User(
//                "Hizkia Vigo",2314123,"Cirebon"
//            ),
//            User(
//                "Andreas Happy",622314123,"Tangerang"
//            ),
//            User(
//                "Agung Hermansyah",62314123,"Jakarta"
//            ),
//            User(
//                "Adjis Doa Ibu",62314123,"Depok"
//            ),
//            User(
//                "Hizkia Vigo",2314123,"Cirebon"
//            )
//        )
//
//        val userAdapter = UserAdapter(userList)
//        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        rvUser.layoutManager = layoutManager
//        rvUser.adapter = userAdapter

    }
}