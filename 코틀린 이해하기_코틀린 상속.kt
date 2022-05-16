package com.example.kimhyungeun

/*
    상속이란?
    : 상속(inheritance)이란 기존의 클래스에 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것을 의미한다.
    이러한 상속은 캡슐화, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나다.
*/

open class Super(name:String){ //코틀린의 클래스는 기본적으로 상속이 불가능하다. open 키워드로 상위 클래스를 선언 시 상속이 가능하다.

}

class Sub(name:String):Super(name){ //하위 클래스를 선언할 때는 클래스 이름 뒤에 콜론(:)을 입력하고 상속받을 상위 클래스의 이름을 입력한다. 또한 하위 클래스의 생성자는 상위 클래스의 생성자를 호출해야한다.

}

/*
    오버라이딩이란?
    : 상속이 주는 최고의 이점이다.
    상속 시 상위 클래스에 정의된 멤버를 하위 클래스에서 자신의 멤버처럼 사용할 수 있는데,
    이를 같은 이름으로 재정의 할 수 있다. 이것이 오버라이딩이다.
*/

open class Super2(){
    open var superData=10 //오버라이딩 기법 사용 시 상위 클래스의 멤버는 open 키워드를 이용하여 선언하고,
    open fun superFun(){
        println("나는 상위클래스 멤버함수 : $superData")
    }
}

open class Sub2():Super2(){
    override var superData=20 //하위 클래스의 멤버는 override 키워드를 이용하여 선언 및 재정의한다.
    override fun superFun(){
        println("나는야 오버라이딩한 하위클래스 멤버함수 : $superData")
    }
}

fun main(){
    var obj=Sub2()
    obj.superFun()
}