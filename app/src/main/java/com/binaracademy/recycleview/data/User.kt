package com.binaracademy.recycleview.data

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable

data class User (
    val name :String? = null,
    val phone : Int? = null,
    val address : String? = null,
        )