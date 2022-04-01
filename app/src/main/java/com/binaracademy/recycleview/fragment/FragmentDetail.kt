package com.binaracademy.recycleview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.binaracademy.recycleview.R

class FragmentDetail : Fragment() {

    private lateinit var tvName : TextView
    private lateinit var tvPhone : TextView
    private lateinit var tvAddress : TextView


    private val arguments : FragmentDetailArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvName = view.findViewById(R.id.tvName)
        tvPhone = view.findViewById(R.id.tvPhone)
        tvAddress = view.findViewById(R.id.tvAddress)

       var name = arguments.name
       var phone = arguments.phone
       var address = arguments.address

        tvName.setText(name)
        tvPhone.setText(phone.toString())
        tvAddress.setText(address)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

}