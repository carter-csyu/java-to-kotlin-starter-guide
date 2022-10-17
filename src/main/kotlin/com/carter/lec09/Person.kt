package com.carter.lec09

class KPerson(
    val name: String = "Unknown",
    var age: Int = 1
) {

    val uppercaseName: String
        get() = this.name.uppercase()

//    var name = name
//        set(value) {
//            field = value.uppercase()
//        }

//    val name = name
//        // 무한루프를 막기 위하여 `field` 예약어를 사용 (backing field)
//        get() = field.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    val isAdult: Boolean
        get() = this.age >= 20
}

class Person(
    // primary constructor (required)
    val name: String,
    var age: Int
) {
    // 생성 시점의 검증을 위해서 init method 를 이용할 수 있다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("이름과 나이가 존재하는 생성자")
    }

    // another constructor
    constructor(name: String) : this(name, 1) {
        println("이름이 존재하는 생성자")
    }

    constructor() : this("Unknown") {
        println("아무것도 없는 생성자")
    }
}

class Person1 constructor(
    name: String,
    age: Int
) {
    val name: String = name
    var age: Int = age
}

class Person2 constructor(
    name: String,
    age: Int
) {
    val name = name
    var age = age
}

class Person3(
    name: String,
    age: Int
) {
    val name = name
    var age = age
}