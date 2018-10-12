package com.sprynchan.kotlin.syntax.stdlib

fun main(args: Array<String>) {

    val elements = 1..100000000000

    val output = elements.asSequence().filter { it < 30 }.map { "Yes" to it }

    println("before")

    output.forEach {
        println(it)
    }

    println("after")

}