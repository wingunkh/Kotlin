package com.example.kimhyungeun

/*
    람다함수란?
    : 코틀린 뿐만 아니라 많은 프로그래밍언어에서 제공하는 익명 함수 정의 기법이다.
    코틀린에서 지원하는 고차함수는 매개변수나 반환값으로 함수를 이용하는데, 이때 람다함수를 주고받을 함수를 간단하게 정의하기 위해 사용한다.

    람다함수의 규칙
    - 람다함수는 함수의 이름이 없으며 { }로 표현한다.
    - 화살표(->) 왼쪽은 매개변수, 오른쪽은 함수 본문이다.
    - 함수 본문의 마지막 표현식이 함수의 반환값이다. (return 문을 사용할 수 없다.)
*/

fun main(){
    var sum={no1:Int,no2:Int -> println(no1+no2)}
    sum(10,20) //람다함수는 이름이 없으므로 함수명으로 호출할 수 없다. 그래서 보통 이렇게 변수에 대입하여 변수를 이용하여 호출한다

    var parameter1={->println("매개변수가 없는 람다함수")} //매개변수가 없는 람다함수는 이렇게 화살표 왼쪽을 비워도 되지만,
    var parameter2={println("매개변수가 없는 람다함수")} //아예 화살표 자체를 생략해도 된다.

    var some:(Int)->Unit={println(it)}
    some(10) //람다함수의 매개변수가 1개일 경우 중괄호 안에서 매개변수 선언을 생략하고 it 키워드를 이용해 매개변수를 이용할 수 있다.
    //단, it 키워드는 해당 매개변수의 타입을 유추할 수 있을 때만 사용 가능하다.
    //매개변수 선언 생략 시 변수 some 의 타입을 유추할 수가 없다. 그러므로 (Int)->Unit 과 같이 변수를 함수타입으로 선언해야 한다. (자세한건 후술)
}