package com.carter.lec16

fun main() {

    val person = Person("A", "B", 100)
    println(person.nextYearAge())

    // 해당 변수의 "현재 타입" 즉 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.
    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive() // Train의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt의 확장함수
}

/**
 * Extension is shadowed by a member
 */
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun createPerson(firstName: String, lastName: String): Person {
//    if (firstName.isEmpty()) {
//        throw IllegalArgumentException("firstName은 비어있을 수 없습니다! 현재 값 : ${firstName}")
//    }

//    if (lastName.isEmpty()) {
//        throw IllegalArgumentException("lastName은 비어있을 수 없습니다! 현재 값 : ${lastName}")
//    }

    fun validateName(name: String, fieldName: String) {
        if (firstName.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : ${name}")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}