package com.sprynchan.kotlin.syntax.tidbits

open class Person


class Employee: Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation days.")
        }
    }
}

class Contractor: Person() {

}


fun hasVacations(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(30)
    } else {
        println("Contractor is passed.")
    }
}

var input: Any = 10

fun main(args: Array<String>) {

    val employee  = Employee()
    val contractor  = Contractor()

    hasVacations(employee)
    hasVacations(contractor)

    val str = input as? String //Safety Casting

}
