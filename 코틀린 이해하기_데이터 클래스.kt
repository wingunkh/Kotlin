package com.example.kimhyungeun

/*
    데이터 클래스란?
    :대부분의 소프트웨어는 데이터를 다루는게 주요 목적이므로 데이터 자체를 표현하는 VO(Value Object) 클래스를 자주 정의한다.
    이를 돕기 위해 코틀린에서는 자주 사용하는 데이터를 객체로 묶어주는 데이터 클래스 기능을 제공하며, data 키워드로 선언한다.
*/

data class DataClass(var name:String, var email:String, var age:Int)

fun main(){
    var data1=DataClass("Kim","99gusrms@naver.com",23)
    var data2=DataClass("Kim","99gusrms@naver.com",23)

    println("두개의 데이터 클래스 객체의 값은 같습니까? : ${data1.equals(data2)}")
    println("객체 data1의 주 생성자가 포함하는 멤버변수의 데이터는? : ${data1.toString()}")
    /*
        equals()함수란?
        :VO 클래스는 데이터를 주요하게 다루므로 객체의 데이터가 서로 같은지 비교할 때가 많다. 이때 equals()함수를 사용한다.
        equals()함수로 일반 클래스의 객체를 비교 시 객체 자체를 비교하므로 위의 결과값은 false 일 것이다.
        하지만 데이터 클래스의 객체를 비교 시 객체의 데이터를 비교하게 됨으로 결과값은 true 이다.
        (각 데이터 클래스의 본문에 있는 멤버는 비교대상이 아니다. equals()함수는 주 생성자의 매개변수만 비교한다.)
    */

    /*
        toString()함수란?
        :equals()함수 외에 유용하게 사용되며 객체가 포함하는 주 생성자 멤버변수의 데이터 정보를 출력한다.
        equals()함수와 마찬가지로 일반 클래스의 객체의 toString()함수는 엉뚱한 값을 출력하며
        역시 주 생성자의 매개변수에 선언된 데이터만 출력한다.
    */
}
