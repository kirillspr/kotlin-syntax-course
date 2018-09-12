package com.sprynchan.kotlin.syntax.classes

object Global {
    val PI = 3.14
}


fun main(args: Array<String>) {
    println(Global.PI)

    val localObject = object {
        val E = 32234
    }

    println(localObject.E)
}
