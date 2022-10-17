package com.carter.lec14

data class PersonDTO(
    val name: String,
    val age: Int,
)

fun main() {
    val person1 = PersonDTO("유춘상", 100)
    val person2 = PersonDTO("유춘상", 100)

    println(person1 == person2)
    println(person1)
}