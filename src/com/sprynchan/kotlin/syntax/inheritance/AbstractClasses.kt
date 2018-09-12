package com.sprynchan.kotlin.syntax.inheritance

abstract class Entity {

    abstract fun store()

}

class Employee: Entity() {
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {

    val employee = Employee()
    
}