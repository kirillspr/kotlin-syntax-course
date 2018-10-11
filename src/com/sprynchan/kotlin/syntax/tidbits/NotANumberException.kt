package com.sprynchan.kotlin.syntax.tidbits

import java.io.BufferedReader
import java.io.FileReader
import java.lang.IndexOutOfBoundsException

class NotANumberException(message: String) : Throwable(message) {}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException(message = "Provided Object is not a number at all")
    }
}

fun main(args: Array<String>) {
    try {
        checkIsNumber("string is not anumber")
    } catch (e: NotANumberException) {
        println(e.message)
    }

    val buffer = BufferedReader(FileReader("input.txt"))

    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
        println(chars)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handled")
        -1
    } finally {
        println("Closing")
        buffer.close()
        -2
    }

    println(result)
}