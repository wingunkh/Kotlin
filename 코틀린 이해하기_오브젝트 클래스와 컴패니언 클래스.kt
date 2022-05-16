package com.example.kimhyungeun

/*
    오브젝트 클래스란?
    : 이름없는 즉, 익명 클래스를 만들 목적으로 사용한다.
    클래스 이름이 없으므로 클래스를 선언하면서 동시에 객체를 생성하지 않는 이상 이후에 객체를 생성할 방법이 없다.
    오브젝트 클래스는 선언과 동시에 객체를 생성한다는 의미에서 object 키워드를 사용한다.
*/

open class Super {
    open var data = 10
    open fun some() {
        println("나는 Super 클래스 some()함수입니다. : $data")
    }
}

var obj= object : Super() { //클래스 타입을 명시해주지 않으면 최상위 타입인 Any 타입으로 취급하지만 이 때 멤버를 이용할 수 없으므로, 상속을 이용한다.
    override var data=20
    override fun some() {
        println("나는 Super 클래스를 상속받은 오브젝트(익명) 클래스 some()함수입니다. : $data")
    }
}

/*
    컴패니언 클래스란?
    : 멤버를 객체를 생성하지 않고도 클래스 이름으로 접근하고자 할 때 사용한다.
    클래스 내부에 companion object { ... } 형태로 선언한다.
*/

class MyClass{
    companion object{
        var data=10
        fun some(){
            println(data)
        }
    }
}

fun main() {
    obj.some() //오브젝트 클래스 객체 obj 로 익명 클래스의 멤버함수를 호출하고 있다.
    MyClass.some() //컴패니언 클래스를 감싸는 클래스 이름 MyClass 으로 멤버에 접근할 수 있게된다.
}