package com.example.myapplication.Kotlin

// 두번까지는 봐준다
// 두번 이상이 넘어가면 리팩토링 해라

// 상속
// 부모로부터 설명서를 물려 받는다.

fun main(args: Array<String>){
    val superCar100: SuperCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()
}

// class 선언시 private은 기본으로 생성됨
// class 상속이 외부접근이 가능토록 하여야 하며
// 이를 가능하게 하는 키워드는 open임
// class 내 함수도 기본적으로 private으로 지정됨
// 똑같이 open으로 이를 상쇄
open class Car100(){
    open fun drive(): String{
        return "달린다"
    }
    fun stop(){

    }
}

class SuperCar100(): Car100(){
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    //        super.drive() // Car100의 drive
    }
}

class Bus100(): Car100(){

}
