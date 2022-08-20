package com.example.kimhyungeun

import java.lang.NullPointerException

fun main(){

}

fun variable(){ //<코틀린 변수>
    val data1=10 //val 키워드로 바꿀 수 없는 변수 선언
    var data2=10 //var 키워드로 초기값 설정 후에도 바꿀 수 있는 변수 선언

    var data3:Int //변수명 뒤에 콜론(:)을 추가해 타입을 명시할 수 있으며 생략 가능하다. 또한 함수 내부 선언 변수는 초기값 할당을 생략 가능하다.

    lateinit var data4:String //lateinit 키워드로 초기값을 할당하지 않고 선언 가능하다. 단, var 키워드로 선언한 변수만 가능하며 Int,Long,Short,Double,Float,Boolean,Byte 타입은 불가능하다.
    val data5:Int by lazy { //lazy 키워드로 초기값을 할당하지 않고 선언 가능하다. by lazy { } 형식으로 선언하며 소스에서 변수가 사용되는 순간 중괄호로 묶은 부분이 자동 실행되며 그 결과값이 초기값으로 설정된다. 단, val 키워드로 선언한 변수만 가능하다.
        println("lazy 키워드를 사용하였습니다.")
        10
    }

    var data6:Int=10 //코틀린의 모든 변수는 객체다. 그러므로 사실 Int 키워드는 데이터 타입이 아니라 객체타입 즉, 클래스다.
    var data7:Int?=null //그렇기 때문에 null을 대입할 수도 있고,
    var data8=data1.plus(10) //객체의 메서드를 호출할 수도 있다.
}

fun string(){ //<코틀린 문자열>
    var str1:String="Hello \n world" //큰따옴표로 문자열 표현 시 줄 바꿈이나 들여쓰기 등을 표현하려면 이스케이프 시퀀스를 입력해야 한다.
    var str2:String="""
        Hello
        World
    """.trimIndent() //하지만 삼중 따옴표를 사용하면 그대로 반영시킬 수 있다. trimIndent()함수는 자동생성되며 들여쓰기를 제거한다.

    println("$str2")

    var stringtemplate="Kim Hyun Geun"
    println("name = $stringtemplate") //String 타입의 데이터에 변수값, 함수 결과값 또는 연산식의 결과값을 포함해야 할 때 문자열 템플릿($)를 사용한다. ex) $variable , ${function(1)}, ${1+2+3}
}

fun nullf(){ //<코틀린 널>
    var data1:Int?=10 //변수를 선언할 때 타입 뒤에 물음표(?)를 표시하여 널 허용 변수로 선언할 수 있다.
    data1=null //널은 값이 할당되지 않은 상황을 의미한다. null을 대입할 수 있다.

    var data2:Int=10 //물음표(?)를 추가하지 않으면 널 불허용으로 선언된다.
    //data2=null //널 불허용 변수이기에 널 포인트 예외 오류가 발생한다.
}

fun operator():Int{ //<코틀린 널 관련 연산자>
    var data3:String?="Kim Hyun Geun"

    var length=data3?.length //널 허용으로 선언한 변수의 멤버에 접근할 때는 반드시 ?.연산자를 이용해야한다. ?.연산자는 널 포인트 예외 오류를 막기위해 변수가 null이 아니면 멤버에 접근하지만 null일 경우 멤버에 접근하지 않고 null을 리턴한다.

    println("data3 = $data3 : ${data3?.length ?: -1}") //?:연산자(엘비스 연산자)는 왼쪽이 null이면 오른쪽 값을 리턴하고, null이 아니면 왼쪽 값을 그대로 리턴한다.

    return data3!!.length //!!연산자는 객체가 null일 때 예외 메세지를 출력하는 연산자이다.
}

fun function(parameter:Int):Int{ //<코틀린 함수>
    //함수 리턴 타입은 생략 시 자동으로 Unit 타입이 적용된다. Unit 타입은 함수에서 리턴 값이 없음을 명시적으로 나타내는 타입이다.
    //함수의 매개변수에는 var 키워드나 val 키워드를 사용할 수 없다. val 키워드가 자동으로 적용되며 이에 따라 함수 안에서 매개변수값을 변경할 수 없다.
    //또한 함수의 매개변수에는 기본값을 선언할 수 있다. ex) fun function(parameter:Int=10):Int { ... } (이때 호출 시 인자를 전달하지 않아도되며 기본값이 인자로 적용된다.)

    return 0
}

fun array(){ //<코틀린 배열>
    //컬렉션 타입이란 여러 개의 데이터를 표현하는 방법이며 Array, List, Set, Map 이 있다.
    //코틀린의 배열은 Array 클래스로 표현한다. Array 클래스의 생성자에서 첫번째 매개변수가 배열의 크기, 두번째 매개변수가 초깃값을 지정하는 함수다.
    val data:Array<Int> = Array(3,{0})  //Int 타입의 크기가 3이고 초기값이 0인 배열 data 를 선언하였다. 홑화살괄호(<>)는 제네릭 기법이며, 선언하는 곳이 아니라 이용하는 곳에서 타입을 지정하게끔 하는 기법이다.

    data[0]=10
    data[1]=20 //이렇게 배열의 요소에 접근하려면 대괄호([])를 이용해도 되지만

    data.set(2,30) //set()함수를 이용하여 해당 인덱스에 요소를 삽입할 수도 있고
    data.get(2) //get()함수를 이용하여 해당 인덱스의 요소를 가져올 수도 있다.

    val primitive:IntArray=IntArray(3,{0}) //배열의 데이터가 기초 타입(primitive type)이라면 Array 클래스를 이용하지 않고 IntArray, CharArray, BooleanArray 등의 클래스를 이용할 수 있다.

    val data2= arrayOf<Int>(1,2,3) //arrayOf()함수를 이용하여 배열을 선언할 때 값을 할당할 수도 있다.
    val data3= intArrayOf(1,2,3) //이 역시 기초 타입을 대상으로 하는 intArrayOf, CharArrayOf, booleanArrayOf 등의 함수를 이용할 수 있다.
}

fun condition(){ //<코틀린 조건문>
    //if~else 조건문은 C와 동일하다. 단 if~else 조건에 따른 결과값을 리턴하는 표현식으로 사용할 수 있다.
    var data:Any=10
    when(data){ //코틀린에는 when 이라는 조건문이 존재한다. 소괄호 안에 넣은 데이터가 조건이되고 이 값에 따라 각 구문이 실행된다.
        is String -> println("data is String") //is는 타입을 확인하는 연산자이다. (데이터가 String 타입이면 true 값을 리턴한다.)
        20,30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10") //in은 범위 지정 연산자이다. (데이터가 1부터 10까지의 범위 내에 있으면 true 값을 리턴한다.)
        else -> println("data is not valid")
    } //when 조건문 역시 if~else 조건문과 마찬가지로 표현식으로 사용할 수 있다.

    var sum:Int=0
    for(i in 1..10){ //for 조건문은 앞서 배운 in 연산자를 이용한다. ..말고 until(조건식은 미포함), step n(증감식: n씩 증가), downTo n(증감식: n씩 감소) 등 다양하게 조건을 작성할 수 있다.
        sum+=i
    } //추가로 컬렉션 이름.indices 를 이용하여 컬렉션의 데이터 개수만큼 반복하게 할 수도 있다. ex) for (i in collection.indices) { ... }
}