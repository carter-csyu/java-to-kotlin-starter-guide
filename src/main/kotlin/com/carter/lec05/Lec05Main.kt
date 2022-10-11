package com.carter.lec05

fun validateScoreIsNotNegative(score: Int): Unit {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}의 범위는 0부터 100 입니다.")
    }
}

/**
 * Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다
 * Expression : 하나의 값으로 도출되는 문장
 */
fun getPassOrFail(score: Int): String {
//    if (score >= 50) {
//        return "P"
//    } else {
//        return "F"
//    }

    return if (score >= 50) "P" else "F"
}

fun getGrade(score: Int): String {
//    if (score >= 90) {
//        return "A";
//    } else if (score >= 80) {
//        return "B";
//    } else if (score >= 70) {
//        return "C";
//    } else {
//        return "D";
//    }

    return if (score >= 90) {
        "A";
    } else if (score >= 80) {
        "B";
    } else if (score >= 70) {
        "C";
    } else {
        "D";
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        10, 9  -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int): Unit {
    when (number) {
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다")
    }
}