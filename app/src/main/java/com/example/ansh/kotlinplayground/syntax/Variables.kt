package com.example.ansh.kotlinplayground.syntax

import android.os.Build
import android.support.annotation.RequiresApi
import java.time.LocalDateTime

/**
 * Created by ansh on 06/02/18.
 */
fun Variables() {

    val immediateAssignment: Int = 1

    val inferredTypeInt = 2

    val deferredAssignment: Int
    deferredAssignment = 3

    var mutableInferredTypeString = "some string"
    mutableInferredTypeString += "some concat"

}

class MutableValExample(val yearOfBirth: Int) {
    val age: Int
        @RequiresApi(Build.VERSION_CODES.O)
        get() = LocalDateTime.now().year - yearOfBirth
}