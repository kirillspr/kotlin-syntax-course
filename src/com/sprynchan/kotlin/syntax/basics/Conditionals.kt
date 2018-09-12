package com.sprynchan.kotlin.syntax.basics

fun main(args: Array<String>) {

    val result = "qwertyu"

    val whenValue = when (result) {
        "qwertyu" -> {
            println("empty")
            "TEST return"
        }
        is String -> {
            println("Good")
            "good result"
        }
        else -> {
            println("Itcame to this?")
            "unknown result"
        }
    }
    println(whenValue)
}