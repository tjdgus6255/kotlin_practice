package com.example.myapplication.Kotlin


// Interface
// - 인터페이스는 약속!
// 상속은 Person이 가지는 기능을 물려받음(사용가능)
// 인터페이스를 구현한다는 것은 내용물을 채운다는 것(구체적인 기능을 만드는 것)
// 인터페이스는 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다
// - 지침서 -> interface Person_을 구현하고 싶으면 아래 기능을 구현해야함

// 상속과 다른점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특징

fun main(args: Array<String>){
    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()

}

interface Person_{
    fun eat()
    fun sleep()
}

class Student_ : Person_{
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlay : Person_{
    override fun eat() {

    }

    override fun sleep() {

    }
}

open class Person(){
    open fun eat(){

    }

    fun sleep(){

    }
}

class Student(): Person(){
    override fun eat(){
        super.eat()
    }
}

class Teacher(): Person(){

}