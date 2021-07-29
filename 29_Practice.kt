package com.example.myapplication.Kotlin

// - 인터페이스에서도 구현이 가능(상속의 역할)
// - 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 구현할 필요가 없다
// - 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 반듯이 구현해야 한다
fun main(args: Array<String>){
    val student = Student__()
    student.sleep()
}

interface Person__{
    fun eat(){
        println("먹는다")
    }
    fun sleep(){
        println("잔다")
    }
    abstract fun study() // abstract는 반드시 구현해야 하는 함수를 의미
}

class Student__ : Person__{
    override fun study() {

    }
}

class Teacher__ : Person__{
    override fun study() {

    }
}
