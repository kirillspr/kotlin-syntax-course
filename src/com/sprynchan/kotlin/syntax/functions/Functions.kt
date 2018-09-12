package com.sprynchan.kotlin.syntax.functions

fun hello(): Unit {
    println("Hello fun")
}

fun throwingExc(): Nothing {
    throw Exception("This functions throws exceptions")
}

fun returnsFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 54, w: Int = 78) = x + y + z + w

fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()

    val value = returnsFour()
    sum(1, 2, 3)
    sum(1, 2)
    sum(1, 2, w = 54)

    printStrings("werwe", "werwe")
    printStrings("werwe", "werwe", "sdafasdf")
}