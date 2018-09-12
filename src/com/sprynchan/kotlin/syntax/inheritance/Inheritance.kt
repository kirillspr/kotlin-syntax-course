package com.sprynchan.kotlin.syntax.inheritance

open class Person() {
    open fun validate() {

    }
}

class Customer: Person {
    override fun validate() {
        super.validate()
    }

    constructor(): super(){

    }
}

fun main(args: Array<String>) {
    val customer = Customer()

}