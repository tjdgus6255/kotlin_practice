package com.example.myapplication.Kotlin


fun main(array: Array<String>){

    // 산술 연산자
    var a = 1 + 1
    var b = 10 + 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입 연산자
    var f = 5

    // 복합 대입 연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 증감 연산자
    a++
    b--
    println()
    println(a)
    println(b)

    // 비교 연산자
    var g = a > b
    var h = a == b
    var i = !g
    println(g)
    println(h)
    println(i)

    var j = h && i
    var k = h || i
    println(j)
    println(k)
}
