package com.carter.lec02

fun main() {
    val str: String? = "ABC"
    // println(str.length) // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println(str?.length ?: 0)

    println(startsWith("ABC"))
    // println(startsWith(null)) // Exception in thread "main" java.lang.NullPointerException

    val person = Person("공부하는 개발자")
    println(startsWithA(person.name))
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//
//    return str.startsWith("A")
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if (str == null) {
//        return false
//    }
//
//    return str.startsWith("A")
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}
