package com.example.myapplication.Kotlin



// 11. 제어흐름 실습

fun main(args: Array<String>){
    val value: Int? = null

    when(value){
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다
    when(value2){
        true -> {println("")}
        false -> {println("")}
        null -> {println("")}
    }

    val value4: Int = 10
    when(value4){
        is Int -> {println("value4 is Int")}
        else -> {println("value4 is nou Int")}
    }

    val value5: Int = 87
    when(value5){
        in 60..70 -> {
            println("value is in 60-70")
        }
        in 70..80 ->{
            println("value is in 70-80")
        }
        in 80..90 ->{
            println("value is in 80-90")
        }
    }
}
