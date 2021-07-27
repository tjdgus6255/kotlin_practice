package com.example.myapplication.Kotlin


var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 변수에 넣어 줄 수 있다
var b = "1"
var c = b.toInt() // b를 Int로 변경
var d = b.toFloat() // b를 Float으로 변경

var e = "John"
var f = "My name is $e Nice to meet you" // 변수 e가 들어옴

// Null
// - 존재 하지 않는다

//var abc : Int = null
var abc : Int? = null 
// Int뒤에 ?를 붙일 경우 null을 가질 수 있는 자료형이 됨
// 다른 자료형도 동일하게 처리 가능
fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc)
}
