package com.sprynchan.kotlin.syntax.classes

import java.util.*

class Customer(val id: Int, var name: String, var yearOfBirth: Int) {

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
}

fun main(args: Array<String>) {

    val customer = Customer(10, "Kirill", 1994)



    println(customer == customer)
}