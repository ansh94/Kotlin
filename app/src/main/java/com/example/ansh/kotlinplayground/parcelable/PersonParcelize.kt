package com.example.ansh.kotlinplayground.parcelable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by ansh on 07/02/18.
 */

//Known bug in Ide, doesn't affect the compilation
@Parcelize
data class PersonParcelize(val name: String,
                           val age: Int,
                           val email: String,
                           val phone: Long) : Parcelable