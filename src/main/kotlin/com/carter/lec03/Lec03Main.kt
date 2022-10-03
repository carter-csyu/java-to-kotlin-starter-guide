package com.carter.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number1_1: Int? = 3
    val number1_2: Long = number1_1?.toLong() ?: 0L

    printAgeIfPerson2(null)
    printAgeIfPerson2(Person("", 100))

    val person = Person("유춘상", 34)
    println("이름 : ${person.name}, 나이: ${person.age}")

    val name = "유춘상"
    println("""
        제 이름은
        $name
        입니다
    """.trimIndent())

    val str = "ABC"
    println(str[0])
    println(str[1])
    println(str[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.age)
}