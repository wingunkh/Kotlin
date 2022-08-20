package com.example.kimhyungeun /* 이 파일을 컴파일 했을 때 만들어지는 클래스 파일의 위치를 나타낸다.
같은 패키지 내의 파일들끼리는 import 없이 멤버(변수, 함수, 클래스)를 참조할 수 있다. */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
    코틀린
    : 코틀린은 젯브레인스에서 오픈소스 그룹을 만들어 개발한 프로그래밍 언어이다.
    2011년 처음 공개되었으며 2017년 구글에서 안드로이드 공식 언어로 채택하였다.
    자바를 대체할 목적으로 만들어진 코틀린은 컴파일 시 자바 바이트 코드로 변환되며 JVM으로 실행 가능하다.

    자바 대체제 코틀린, 장점은?

        - 표현력과 간결함 : 최신 언어 기법을 사용하여 자바보다 훨씬 간결함.

        - 널 안전성 지원 : 객체는 널 상태일 수 있고 이 때 런타임 오류 (NullPointException)가 발생하는데
        코틀린에서는 널 허용 및 널 비허용 방식을 통해 안전성을 제공한다.

        - 상호 운용성 : 자바와 100% 호환 가능하다. (자바 라이브러리 이용, 코드 혼용 등등 전부 가능)

        - coroutine 지원 : 프로그래밍에서 순서대로 작업을 수행하여 1개의 루틴(함수, 서브루틴을 포함하는 상위 개념)
          을 완료한 후 다른 루틴을 실행하는 방법을 동기적 프로그래밍이라고 한다.
          반면 여러 개의 루틴이 선행 작업의 순서나 완료 여부와 상관없이 실행 되는 방식을 비동기적 프로그래밍이라고 한다.
          코틀린이 제공하는 coroutine 기법을 이용하여 효율적이고 간소화된 비동기적 프로그래밍이 가능하다.
 */