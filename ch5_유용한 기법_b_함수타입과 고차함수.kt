package com.example.kimhyungeun

/*
    함수타입이란?
    : 함수타입이란 함수를 선언할 때 나타내는 매개변수와 반환타입을 의미한다. ex) (Int,Int)->Int
    앞서 배운 람다함수는 주로 변수에 대입해서 사용했는데,
    변수는 타입을 가지며 "타입을 유추할 수 있을 때"를 제외하고는 생략이 불가능하다.
    이러한 이유 때문에 변수에 함수를 대입하려면 변수를 함수타입으로 선언해야한다.
*/

var some:(Int,Int)->Int = {no1,no2 -> no1+no2} //람다함수의 선언식에서 매개변수의 타입을 생략했다. 이 경우 람다함수의 함수타입을 알 수 없으므로 람다함수를 대입하는 some 변수에 함수타입을 선언했다.

typealias MyInt=(Int,Int)->Boolean //typealias 키워드를 이용해 데이터타입이나 함수타입의 별칭을 선언할 수 있다.
var someFun:MyInt={no3,no4->no3>no4} //보통 함수타입을 선언하는데 많이 사용한다.

/*
    고차함수란?
    : 일반적으로 함수의 매개변수나 반환값은 데이터이다.
    그러나 함수를 매개변수로 전달받거나 반환하는 함수를 우리는 특별히 고차함수라고 부른다.
*/

fun hofFun(para:(Int)->Boolean):()->String{ //()->String 은 hofFun 함수의 매개변수가 함수이며(매개변수 para 는 함수이다.) 반환타입이 String(리턴값이 문자열이다.) 임을 의미하는 함수타입이다.
    var result=if(para(10)){ //para(10)이 참이면
        "valid"
    }
    else{
        "invalid"
    }
    return {"hofFun result : $result"}
}

fun main(){
    var result= hofFun({no -> no>0})
    //매개변수인 para 변수가 함수타입이므로 인자로 함수를 전달해야 한다.
    //람다함수 { no -> no>0 }를 전달하였다.

    println(result()) //valid
}