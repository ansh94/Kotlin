package com.example.ansh.kotlinplayground.dataclasses.defaultsandcopy

/**
 * Created by ansh on 06/02/18.
 */
data class Person(val name: String = "default name", val age: Int = 30,
                  val email: String = "dummy email", val phone: Long = 1234567890)


// not taking advantage of default values as we are passing the arguments
val person1 : Person = Person("name", 25, "email@gmail.com", 555544448)

//default values are used
val person2 : Person = Person()

//passing the first two arguments and for others default values are used
val person3 : Person = Person("name", 25)

//using named arguments we can just name the arguments we are passing and order is not important
val person4 : Person = Person(name = "name", phone = 9876543210)


// copying data classes in Kotlin
val person1Copy = person1.copy()

val person1With30 = person1.copy(age = 30)

val person4WithEmail = person4.copy(email = "person4@gmail.com")