package com.sprynchan.kotlin.syntax.inheritance

interface CustomerRepository {

    val isEmpty: Boolean
        get() = true

    fun store() {

    }

    fun getById(id: Int): Customer

}

class SQLCustomerRepository: CustomerRepository {
    override fun getById(id: Int): Customer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    val sqlCustomerRepository =  SQLCustomerRepository()

    sqlCustomerRepository.store()
}