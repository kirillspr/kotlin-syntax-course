package com.sprynchan.kotlin.syntax.classes

enum class Priority(val value: Int) {

    MINOR(1) {
        override fun say(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },

    NORMAL(2) {
        override fun say(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },

    MAJOR(3) {
        override fun say(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },

    CRITICAL(4) {
        override fun say(): String {
            println("critical")
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun say(): String
}

fun main(args: Array<String>) {

    val priority = Priority.CRITICAL

    println(priority)
    println(priority.value)
    println(priority.ordinal)
    println(Priority.MAJOR)

}