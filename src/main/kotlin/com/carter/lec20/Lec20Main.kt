package com.carter.lec20

data class Person(
    val name: String,
    var age: Int,
) {
    var hobby: String? = null

    fun growOld(): Unit {
        age += 1
    }
}

data class PersonDto(
    val name: String,
    val age: Int,
)

fun printPerson(person: Person?) {
    // before
    if (person != null) {
        println(person.name)
        println(person.age)
    }

    // after
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun getPerson(): Person? {
    return Person("유춘상", 33)
}

fun getStr(): String? {
    return "유춘상"
}

fun getPerson(
    name: String,
    age: Int,
    hobby: String,
): Person {
    return Person(
        name = name,
        age = age
    ).apply {
        this.hobby = hobby
    }
}

fun main() {
    val person = getPerson()

    // age
    val value1: Int? = person?.let {
        it.age
    }

    // age
    val value2: Int? = person?.run {
        this.age
    }

    // person
    val value3: Person? = person?.also {
        it.age
    }

    // person
    val value4: Person? = person?.apply {
        this.age
    }

    with(person) {
        println(this?.name)
        println(this?.age)
    }

    println("-----------------")

    // let (하나 이상의 함수를 call chain 결과로 호출할 때)
    val strings = listOf("apple", "car")
    strings.map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }

    val str: String? = getStr()
    // let (non-null 값에 대해서만 code block 을 실행시킬 때)
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // let (일회성으로 제한된 영역에 지역 변수를 만들 때)
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem) // !ONE!

    // run (객체 초기화와 반환 값의 계산을 동시에 해야할 때)
    // 객체를 만들어 DB에 바로 저장하고, 그 인스턴스를 활용할 때
    // val person = Person("유춘상", 33).run(personRepository::save)

    /*
    val person = Person("유춘상", 33).run {
        hobby = "잠자기"
        personRepository.save(this)
    }
     */
    // 하지만 결국...
    // val person = personRepository.save(Person("유춘상", 33))

    // apply (객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때)
    val person2 = Person("유춘상", 33)
    person2.apply { this.growOld() }
        .let { println(it) }

    // also
    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 값: $it") }
        .add("four")

    val numbers2 = mutableListOf("one", "two", "three")
    println("four 추가 이전 값: $numbers2")
    numbers2.add("four")
    println("four 추가 이후 값: $numbers2")

    val person3 = Person("유춘상", 33)
    // with (특정 객체를 다른 객체로 변환해야 하는데, 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때)
    val personDto: PersonDto = with(person3) {
        PersonDto(
            name = name,
            age = age,
        )
    }
    // this를 생략할 수 있어 필드가 많아도 코드가 간결해진다.

    // scope function 과 가독성
    // 1번 코드
    /*
    if (person != null && person.isAdult) {
        view.showPerson(person)
    } else {
        view.showError()
    }
     */
    // 2번 코드
    /*
    person?.takeIf { it.isAdult }
        ?.let(view:showPerson)
        ?: view.showError()
     */
}