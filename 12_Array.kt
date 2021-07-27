package com.example.myapplication.Kotlin


// 12. 배열

// 배열이 필요한 이유
// - 그룹(모음집)이 필요할 때

fun main(array: Array<String>){
    // 배열을 생성하는 법_1
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    // 배열을 생성하는 방법_2
    var group2 = arrayOf(1, "Hello", 3, 4, 5)

    // 배열의 값을 꺼내는 방법_1

    println(group1.get(0))
    println(group1.get(4))

    // 배열의 값을 꺼내는 방법_2
    println(group2[1])

    // 배열의 값을 바꾸는 방법_1
    group1.set(0, 100)
    println(group1[0])

    // 배열의 값을 바꾸는 방법_2
    group1[0] = 1344
    println(group1[0])
}
