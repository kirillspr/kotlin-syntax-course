package com.sprynchan.kotlin.syntax.basics

fun main(args: Array<String>) {

    var streetNumber = 10
    var streetName = "Yantarnaya"

    val zip = "E11 P!"

    val myLong = 10L
    val myFLoat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01


    //String
    val myChar = 'a'
    val myString = "asdfasdfasdf"
    val escapeCharacters = "A new line \n"
    val rawString = "Hello" +
            "sdfsadfasdf" +
            "asdasdasd"

    val multiLines = """
        kasdfjhasjkdf
        asdfghjaslkfjasd
        gdsflgjksdlfkjgsd
        lsdkgjdslkfgj
        """
    val years = 10
    val message = "A decade is $years years"

    val name = "kirill"
    val anotherMEssage = "Lenght of name is ${name.length}"
}