package com.sprynchan.kotlin.syntax.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, y: Int, op: (Int) -> Unit) {

}

fun route(x: Int, vararg actions: (String, Int) -> Double) {

}

fun sum(x: Int, y: Int) = x + y

fun unaryOperation(x: Int, op: (Int) -> Int) {
    op(x)
}

fun unaryOp(op: (Int) -> Int) {

}

class Database {
    fun commit() {

    }
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

fun main(args: Array<String>) {

    val result = operation(1, 2, ::sum)
    println(result)

    val someLambda: (Int, Int) -> Int = { x, y -> x + y }
    val lambaOperationResult = operation(1, 3, someLambda)

    unaryOperation(2, { it * it })
    unaryOperation(2) { it * it }

    unaryOp {
        it * it
    }

    val db = Database()

    transaction(db) {
        //interact with db

    }

    unaryOperation(3, fun(x: Int): Int { return x * 2 })
}
