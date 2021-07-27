package com.example.myapplication.Kotlin

// 04. Function
// - 함수
// - 어떤 input을 넣어주면 어떤 output 나오는 것
// fun 함수명(변수명 : 타입, 변수명 : 타입 ....) : 반환형{
//      함수내용
//      return 반환값
//  }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기
// Unit은 아무것도 return 하지 않겠다는 의미
// Unit은 생략 가능
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// - 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second


// - 가변인자를 갖는 함수 선언하는 방법
// 1개부터 n개의 인자를 받을 수 있음
fun plusMany(vararg numbers: Int){
    for(number in numbers){
        println(number)
    }
}

fun main(array: Array<String>) {
    //val result = plus(5, 10)
    //println(result)

    val result2 = plus(second = 100, first = 10)
    println(result2)

    val result4 = plusFive(10, 20)
    println(result4)

    val result5 = plusFive(10)
    println(result5)

    println()
    printPlus(10, 20)

    println()
    val result6 = plusShort(50, 50)
    println(result6)

    println()
    plusMany(1, 2, 3)
}

