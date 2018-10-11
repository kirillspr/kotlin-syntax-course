package com.sprynchan.kotlin.syntax.tidbits

const val GlobalConstant = "Global Consntan really"

object Copyright {
    const val author = "Kirill Sprinchan"
}

fun main(args: Array<String>) {
    Copyright.author
    GlobalConstant
}