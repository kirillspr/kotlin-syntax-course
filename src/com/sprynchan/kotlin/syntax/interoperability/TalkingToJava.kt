package com.sprynchan.kotlin.syntax.interoperability

import com.sprynchan.kotlin.syntax.interoperability.java.CustomerJava
import com.sprynchan.kotlin.syntax.interoperability.java.CustomerJavaRepository
import com.sprynchan.kotlin.syntax.interoperability.java.PersonJava

fun main(args: Array<String>) {
    val customer = CustomerJava()

    customer.email = "customer@gmail.com"

    customer.print()

    val notNullableString = customer.notNullableString()
    val nullableString = customer.nullableString()

    val runnable = Runnable { println("Runnable exec") }
}

class PersonKotlin : PersonJava() {

}

class KotlinCustomerRepo : CustomerJavaRepository {
    override fun getById(id: Int): CustomerJava? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
