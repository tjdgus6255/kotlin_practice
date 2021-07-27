package com.example.myapplication.Kotlin



// 16. Iterable

fun main(array: Array<String>){
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법_1
    for(item in a){
        if(item==5){
            println("item is Five")
        }else{
            println("item is not Five")
        }
    }
    println()

    // 반복하는 방법_2
    for((index, item) in a.withIndex()){
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }
    // 반복하는 방법_3
    a.forEach{
        println(it)
    }
    a.forEach{item ->
        println(item)
    }
    a.forEachIndexed{index, item ->
        println("index : " + index + " value : " + item)
    }

    // 반복하는 방법_6
    println()
    println(a.size)
    for(i in 0 until a.size){
        println(a.get(i))
    }
    for (i in 0 until a.size step(2)){
        println(a.get(i))
    }
    println()

    for (i in a.size - 1 downTo (0)){
        println(a.get(i))
    }
    for (i in a.size - 1 downTo (0) step(2)){
        println(a.get(i))
    }

    for (i  in 0..10){
        println(i)
    }

    // ..은 마지막을 포함o
    // until은 마지막을 포함x

    // 반복하는 방법_11
    var b: Int = 0
    var c: Int = 4

//    while(b < c){
//        b++
//        println("b")
//    }

    // 반복하는 방법_12
    do{
        b++
        println("hello")
    }while(b < c)
}