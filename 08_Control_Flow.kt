package com.example.myapplication.Kotlin


// 08. 제어 흐름
// - if, else
fun main(args: Array<String>){
    val a: Int = 5
    val b: Int = 10

    if (a>b){
        println("a가 b보다 크다")
    }
    else{
        println("a가 b보다 작다")
    }
    println("3번")
    if (a>b){
        println("a가 b보다 크다")
    }
    // 값을 리턴하는 if 사용방법
    val max = if (a>b){
        a
    } else {
        b
    }
    println()
    println(max)

    // 값을 리턴하는 if 사용방법_2
    val max2 = if (a>b) a else b
    println()
    println(max2)
}
