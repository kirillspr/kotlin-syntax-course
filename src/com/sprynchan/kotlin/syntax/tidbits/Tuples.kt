package com.sprynchan.kotlin.syntax.tidbits

import com.sprynchan.kotlin.syntax.classes.Customer


fun pairExample(capital: String): Pair<String, Int> {
    return Pair(capital, (1..1000).shuffled().last())
}


fun tripleExample(capital: String): Triple<String, Int, String> {
    return Triple(first = capital, third = "Europe", second = (1..1000).shuffled().last())
}


fun main(args: Array<String>) {

    val pairResult = pairExample("Minsk")
    println(pairResult.first)
    println(pairResult.second)

    val tripleResult = tripleExample("Moscow")
    println(tripleResult.first)
    println(tripleResult.second)
    println(tripleResult.third)

    val (capital, population) = pairExample("Kiev")
    println(capital)
    println(population)

    val (id, name, birth) = Customer(1, "Kirill Sprinch", 1994)
    println(name + id)

    val listOfCapitalsAnsCountres = listOf(Pair("Minsk", "Belarus"), "Kiev" to "Ukraine", "Moscow" to "Russia")

    for ((capitalInList, country) in listOfCapitalsAnsCountres) {
        println("$capitalInList $country")
    }
}