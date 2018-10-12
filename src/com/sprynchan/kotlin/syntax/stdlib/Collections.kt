package com.sprynchan.kotlin.syntax.stdlib

fun main(args: Array<String>) {

    val cities = listOf("Madrid", "Paris", "London")
    val emptyList = emptyList<String>()

    val numbres = 1..100

    println(cities.javaClass)
    println(emptyList.javaClass)

    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")


    val hashMap = hashMapOf("Madrid" to "Spain", "London" to "UK")

}