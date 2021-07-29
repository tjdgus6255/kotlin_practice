package com.example.myapplication.Kotlin



// 접근 제어자

fun main(args: Array<String>){
    val testAccess: TestAccess = TestAccess("아무개")
//    testAccess.test() // private으로 인해 test 함수는 외부에서 사용 불가
    println(testAccess.name)
    testAccess.name = "아무개 투"
    println(testAccess.name)

    val reward: Reward = Reward()
    // reward.rewardAmount = 2000
    // rewardAmount는 수정이 되지 말아야 함
}

class Reward(){
    private var rewardAmount: Int = 1000
}

class TestAccess{
    var name: String = "홍길동"

    constructor(name: String){
        this.name = name
    }

    fun changeName(newName: String){
        this.name = newName // private 지정된 변수는 class내 함수에서 수정 가능능
   }
    private fun test(){
        println("테스트트")
   }
}

class RunningCar(){

    fun runFast(){
        run()  // run함수를 외부에 공개하고 싶지 않거나 내부 함수의 보조역할을 위해 사용되는 경우 private 사용
    }

    private fun run(){

    }
}