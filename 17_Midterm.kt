package com.example.myapplication.Kotlin

//1번 문제
//fun main(args: Array<String>){
//    val ListInt = mutableListOf<Int>()
//    val ListBool = mutableListOf<Boolean>()
//
//    for (i in 0..9){
//        ListInt.add(i, i)
//        if (i%2 == 0)ListBool.add(i, true)
//        else ListBool.add(i, false)
//    }
//
//    println("ListInt : " + ListInt)
//    println("ListBool : " + ListBool)
//}
/////////////////////////////////////////////////
//1번 정답
//fun main(array: Array<String>){
//    first()
//}
//
//fun first(){
//    val list1 = MutableList(9 ,{0})
//    val list2 = MutableList(9, {true})
//
//    for (i in 0..8){
//        list1[i] = i + 1
//    }
//    println(list1)
//
//    list1.forEachIndexed{index, value ->
//        if(value % 2 == 0)list2[index] = true
//        else list2[index] = false
//    }
//    println(list2)
//}
/////////////////////////////////////////////////
//2번문제
//fun main(args: Array<String>){
//    var score = 9
//    if(score in 80..90)println("A")
//    else if(score in 70..79)println("B")
//    else if(score in 60..69)println("C")
//    else println("F")
//}
/////////////////////////////////////////////////
//2번 정답
//fun main(array: Array<String>){
//    println(second(80))
//}
//
//fun second(score: Int): String{
//    when(score){
//        in 90..100 ->{
//            return "A"
//        }
//        in 80..89 ->{
//            return "B"
//        }
//        in 70..79 ->{
//            return "C"
//        }
//        else -> {
//            return "F"
//        }
//    }
//}
/////////////////////////////////////////////////
//3번문제
//fun main(args: Array<String>){
//    var number = 43
//    var number_10 = number / 10
//    var number_1 = number % 10
//    println(number_10 + number_1)
//}
/////////////////////////////////////////////////
//3번 정답
//fun main(args: Array<String>){
//    println(third(89))
//}
//
//fun third(number: Int): Int{
// val a: Int = number / 10
// val b: Int = number % 10
//    return a + b
//}
/////////////////////////////////////////////////
//4번문제
//fun main(args: Array<String>){
//    for(i in 1..9){
//        for (j in 1..9){
//            print(i)
//            print("*")
//            print(j)
//            print("=")
//            print(i*j)
//            println()
//        }
//    }
//}
/////////////////////////////////////////////////
//4번 정답
//fun main(args: Array<String>){
//    gugudan()
//}
//fun gugudan(){
//    for (x in 1..9){
//        for (y in 1..9){
//            println("$x x $y = ${x*y}")
//        }
//    }
//}