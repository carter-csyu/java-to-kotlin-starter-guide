package com.carter.lec09

fun main() {
    val person = Person("유춘상", 34)
    println("name = ${person.name}, age = ${person.age}")

    person.age = 33 // setter
    println("name = ${person.name}, age = ${person.age}")

    println("----------------")

    val jPerson = JavaPerson("유춘상", 34)
    println("name = ${jPerson.name}, age = ${jPerson.age}")

    println("----------------")

    val person0 = Person()
    println("name = ${person0.name}, age = ${person0.age}")

    println("----------------")

    val kPerson = KPerson()
    println("name = ${kPerson.name}, age = ${kPerson.age}, adult = ${kPerson.isAdult}")
}