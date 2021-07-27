package com.example.myapplication.Kotlin


fun main(array: Array<String>){
    val array = arrayOf<Int>(1, 2, 3)

    val number = array.get(0)
    println(number)
//    val number2 = array.get(100) // 인덱스에 주의
    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)
//    array.set(100, 100)

    // Array의 bounds
    // - 처음 만들때 결정

    // Array를 만드는 방법_3
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('c', 'c') // char -> '', string -> ""
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)

    // Array를 만드는 방법_4 -> lambda를 활용한 방법
    var a5 = Array(10, {0})
    var a6 = Array(5, {1;2;3;4;5})

    println(a5[1])
    println(a6[3])


}