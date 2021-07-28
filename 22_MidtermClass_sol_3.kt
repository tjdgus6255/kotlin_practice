package com.example.myapplication.Kotlin


fun main(args: Array<String>){
    val channels = listOf<String>("K", "M", "S")
    val tv = TV(channels)
    tv.switch()
    println(tv.onOrOff)
    tv.switch()
    println(tv.onOrOff)
    tv.channelUp()
//    println(tv.checkCurrentChannel())
    tv.channelUp()
//    println(tv.checkCurrentChannel())
    tv.channelUp()
//    println(tv.checkCurrentChannel())
    tv.channelUp()
//    println(tv.checkCurrentChannel())
}

class TV(val channels: List<String>){

    var onOrOff: Boolean = false // True -> On, False -> Off
    var currentChannelNumber = 0
        set(value){
            field = value
            if(field > 2){
                field = 0
            }
            if(field < 0){
                field = 2
            }
            // currentChannelNumber = value와 같이 할당할 경우 무한루프에 빠짐
            // set은 currentChannelNumber에 값을 할당할 때마다 호출
        }
        get(){
            println("호출되었습니다")
            return field
            // currentChannelNumber가 호출될 때마다 get 호출
        }
    fun switch(){
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String{
        return channels[currentChannelNumber]
    }
    fun channelUp(){
        currentChannelNumber = currentChannelNumber + 1
//        channels.forEachIndexed { index, value ->
//            if(currentChannelNumber == index){
//                currentChannelNumber = currentChannelNumber + 1
//                return
//            }
//        }
    }

    fun channelDown(){
        currentChannelNumber = currentChannelNumber - 1
//        channels.forEachIndexed { index, value ->
//            if(currentChannelNumber == index){
//                currentChannelNumber = currentChannelNumber - 1
//                return
//            }
//        }
    }
}