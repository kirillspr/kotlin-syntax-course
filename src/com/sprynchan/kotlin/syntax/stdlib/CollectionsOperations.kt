package com.sprynchan.kotlin.syntax.stdlib

data class Person(val name: String, val phones: List<Phone> = listOf())

data class Phone(val producer: String)

val persons = listOf(
        Person("Kirill",
                listOf(
                        Phone("iPhone 5s"),
                        Phone("iPhone X")
                )),
        Person("Zhenya", listOf(Phone("iPhone SE")))
)

fun main(args: Array<String>) {
    val names = persons
            .map { it.name }

    println(names)

    val phones = persons.flatMap {
        it.phones.map { it.producer }
    }

    println(phones)

}