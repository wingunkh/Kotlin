package com.example.kimhyungeun

/*
    객체지향 프로그래밍이란?
    : 객체 지향 프로그래밍(Object-Oriented Programming, OOP)은 컴퓨터 프로그래밍의 패러다임 중 하나이다.
    객체 지향 프로그래밍은 컴퓨터 프로그램을 명령어의 목록으로 보는 시각에서 벗어나 여러 개의 독립된 단위,
    즉 "객체"들의 모임으로 파악하고자 하는 것이다. 각각의 객체는 메시지를 주고받고, 데이터를 처리할 수 있다.
*/

class User {
    var name="unknown"

    constructor(name:String){ //코틀린의 생성자는 constructor 키워드로 선언한다. (코틀린의 생성자는 주 생성자, 보조 생성자로 구분하며 서로 독립적이다.)
        this.name=name
    }
}

class Ctor (name:String){ //주 생성자는 클래스 선언부에 선언하며 필수는 아니지만 한 클래스에 하나만 생성 가능하다. 또한 주 생성자를 선언할 때 construction 키워드를 생략할 수 있다.
    init{
        println("나는야 주 생성자")
    } //init 키워드를 이용해 주 생성자의 본문을 구현할 수 있다. init 키워드로 지정한 영역은 객체 생성 시 자동실행된다.

    constructor(name:String,age:Int):this(name){ //보조 생성자는 클래스의 본문에 선언하며 여러 개 생성이 가능하다. 주 생성자와 보조 생성자를 모두 선언한다면 반드시 생성자끼리 연결해줘야 한다.
        println("나는야 보조 생성자")
    } //this()구문을 이용하여 보조 생성자에서 주 생성자를 호출하게끔 연결하였다.
}

class PrimaryConstructor constructor(var name:String,var age:Int){ //함수의 매개변수는 지역변수이므로 다른 함수에서 사용할 수 없다. 그러나 주 생성자의 매개변수를 var 키워드나 val 키워드로 선언하면 클래스의 멤버변수가 되어서 다른 함수에서 사용하게끔 할 수 있다.
    fun someFun(){
        println("name : $name, age: $age")
    }
} //(함수의 매개변수를 선언할 때 var 키워드나 val 키워드를 추가할 수 없는것이 원칙이지만 주 생성자만 유일하게 예외이다!)

fun main(){
    var user1=User("Kim Hyun Geun") //객체를 생성하는 구문이다. 생성자를 이용한다.
    var user2=Ctor("Kim Hyun Geun",23)
    var user3=PrimaryConstructor("Kim Hyun Geun",23)
    user3.someFun()
}