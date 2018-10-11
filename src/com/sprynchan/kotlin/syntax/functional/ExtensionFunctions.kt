package com.sprynchan.kotlin.syntax.functional

fun String.hello() {
    println("It's me")
}

fun String.toTitleString(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred(message: String) {
    println("Extension function version - $message")
}

open class BaseClass
class InheritedClass : BaseClass()

fun BaseClass.extension() {
    println("Base class extension")
}

fun InheritedClass.extension() {
    println("Inherited class extension")
}


fun main(args: Array<String>) {
    val str = "Another one two three"

    println(str.toTitleString())

    val customer = Customer()
    customer.makePreferred()
    customer.makePreferred("hi hi")

    val instance = InheritedClass()

    instance.extension()
}