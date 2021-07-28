package com.example.myapplication.Kotlin


// 1) 사칙 연산을 수행할 수 있는 클래스
// 2) 은행 계좌 만들기
//   - 계좌 생성 기능(이름, 생년 월일)
//   - 잔고 확인 기능
//   - 예금 / 출금 기능
// 3) TV 클래스
//   - on/off 기능
//   - 채널을 돌리는 기능
//   - 초기 채널은 (S사 M사 K사 3개)


// 19는 제가 작성한 코드입니다.
// 20/ 21/ 22는 강의에서 제공하는 solution입니다.

//fun main(args: Array<String>){
//    var cal: Calculator = Calculator('-', 3, 4)
//    var person1: MakeBankCount = MakeBankCount(5000, "철수", "4월 23일")
//    person1.verify()
//    person1.withdraw(6000)
//    person1.withdraw(3000)
//    person1.verify()
//    person1.deposit(2000)
//    person1.verify()
//    var LG: TV = TV("H", false)
//    LG.change()
//    LG.onoff()
//    LG.change()
//    var SamSung: TV = TV("S", true)
//    SamSung.change()
//    SamSung.onoff()
//    SamSung.change()
//}
//
//// 1번 계산기
//class Calculator{
//    var operator: Char
//    var num1: Int
//    var num2: Int
//
//    constructor(operator: Char, num1: Int, num2: Int){
//        this.operator = operator
//        this.num1 = num1
//        this.num2 = num2
//
//        if(operator=='+') plus(num1, num2)
//        else if(operator=='-') minus(num1, num2)
//        else if(operator=='*') multiply(num1, num2)
//        else divide(num1, num2)
//    }
//
//    fun plus(num1: Int, num2: Int){
//        println("$num1 + $num2 = ${num1+num2}")
//    }
//    fun minus(num1: Int, num2: Int){
//        println("$num1 - $num2 = ${num1-num2}")
//    }
//    fun multiply(num1: Int, num2: Int){
//        println("$num1 * $num2 = ${num1*num2}")
//    }
//    fun divide(num1: Int, num2: Int){
//        println("$num1 / $num2 = ${num1/num2}")
//    }
//}
//// 2번 은행 계좌
//class MakeBankCount{
//    var balance: Int = 0
//    var name: String
//    var birth: String
//
//    constructor(balance: Int, name: String, birth: String){
//        this.balance = balance
//        this.name = name
//        this.birth = birth
//    }
//
//    fun verify(){println("잔액은 $balance 원입니다")}
//    fun withdraw(price: Int): Int{
//        if (balance - price < 0){
//            println("잔액이 부족합니다")
//            return 0
//        } else{
//            balance = balance - price
//            return balance
//        }
//    }
//    fun deposit(price: Int): Int{
//        balance = balance + price
//        return balance
//    }
//}
//// 3번 TV
//class TV{
//    var channel: String
//    var state: Boolean
//
//    constructor(channel: String, state: Boolean){
//        this.channel = channel
//        this.state = state
//        println("channel : $channel")
//        println("state : $state")
//    }
//
//    fun onoff(): Boolean{
//        if(state){
//            state = false
//            println("전원이 꺼졌습니다")
//            return state
//        }
//        else{
//            state = true
//            println("전원이 켜졌습니다")
//            return state
//        }
//    }
//    fun change(): String{
//        if(state){
//            if(channel=="S"){
//                channel = "M"
//                println("channel M 전환")
//                return channel
//            } else if(channel=="M"){
//                channel = "K"
//                println("channel K 전환")
//                return channel
//            } else if(channel=="K"){
//                channel = "S"
//                println("channel S 전환")
//                return channel
//            } else{
//                println("존재하지 않는 channel입니다")
//                return channel
//            }
//        } else{
//            println("전원이 꺼져있습니다")
//            return channel
//        }
//    }
//
//}


