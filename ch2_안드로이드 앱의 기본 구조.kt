package com.example.kimhyungeun //패키지란? 파일의 집합이다. ( 프로젝트 > 모듈 > 패키지 > 파일 )

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
} //AppCompatActivity를 상속받아 MainActivity라는 클래스를 정의했다. AppCompatActivity는 Activity의 하위클래스이므로 MainActivity역시 액티비티 컴포넌트 클래스이다.

/*
    안드로이드는 리눅스 커널을 기반으로 구글에서 제작한 모바일 운영체제다. (자바나 코틀린 언어를 이용해 앱 개발)

    자바에서는 소스를 컴파일 해 자바 바이트코드(.class)로 만들고 바로 자바 가상 머신(JVM)에서 실행시키지만
    안드로이드는 자바 바이트코드(.class)를 그대로 실행하지 않고 DEX파일(.dex)로 컴파일 후
    ART(안드로이드 런타임)에서 실행한다.

    안드로이드 앱 개발의 핵심은 '컴포넌트'이다. (컴포넌트 = 앱의 구성 요소)
    안드로이드에서는 클래스로 컴포넌트를 개발한다. 즉, 하나의 클래스가 하나의 컴포넌트가 된다.
    앱은 여러 클래스로 구성되는데 생명주기 관리를 개발자 코드에서 하는 '일반 클래스'와
    안드로이드 시스템에서 하는 '컴포넌트 클래스'로 분류한다.

    안드로이드 컴포넌트의 종류는 크게 화면을 구성하는 '액티비티' , 백그라운드 작업을 하는 '서비스'
    앱의 데이터를 공유하는 '콘텐츠 프로바이더' , 시스템 이벤트 발생 시 실행되게 하는 '브로드캐스트 리시버'
    4종류가 있다. 이 4종류의 컴포넌트를 구분하는 방법은
    개발자가 클래스를 만들 때 지정된 클래스를 상속 받아야 하는데 이 상위 클래스를 보고 구분한다.

    또한 컴포넌트는 앱 내에서 서로 종속되지 않는 독립된 실행단위이다.
    그렇기에 코드 결합이 아닌 안드로이드 시스템에 의뢰함으로써 두 클래스를 독립적으로 실행시킨다.
    이러한 컴포넌트의 독립성 덕분에 앱의 실행 시점이 다양할 수 있고 안드로이드 앱에는 메인함수(앱의 단일 시작점)
    개념이 없다고 말할 수 있는 것이다.

    컴포넌트와 함께 안드로이드 앱 개발의 또 다른 특징은 '리소스'이다. (리소스 = 코드에서 정적인 값을 분리한 것)
    항상 정적인 값을 굳이 코드에 담지 않고 리소스로 분리해서 개발하면 코드가 짧아져서 생산성과 유지보수성이 좋아진다.
    XML의 속성값이 @으로 시작하면 리소스를 의미한다.

    안드로이드 앱 프로젝트 생성 시 app이라는 '모듈'이 자동 생성된다. (모듈 = 앱의 단위, 모듈 하나가 앱 하나.)
    모듈 하위에 많은 폴더와 파일들이 생성되는데 관심 가져야 할 파일은 크게 4가지이다.

    - AndroidManifest.xml (앱 환경설정 파일)
        안드로이드 앱의 메인 환경 파일이다. 개발부터 실행까지 매우 중요한 역할을 한다.
        컴포넌트는 시스템에서 생명주기를 관리한다고 배웠는데, 시스템은 매니페스트 파일에 있는대로 앱을 실행한다.
        결국 컴포넌트는 매니페스트 파일에 등록해야 시스템이 인지한다는 것이다.
        (ex. 네임스페이스 선언, 컴포넌트 선언 등)

    - MainActivity.kt (메인 액티비티 파일)
        매니페스트 파일의 설정값에 따라 스마트폰에 앱을 설치한 후 앱 아이콘을 터치할 때 실행되는 파일이다.

    - activity_main.xml (레이아웃 xml파일)
        화면을 구성하는 레이아웃 XML 파일이다.

    - build.gradle (빌드 설정 파일)
        gradle은 안드로이드 앱의 빌드도구이며 이 gradle의 설정파일이다.
        프로젝트 수준의 build.gradle과 모듈 수준의 build.gradle이 있는데,
        모듈은 앱을 의미하므로 대부분의 빌드 설정은 모듈 수준의 build.gradle에 작성한다.
        (ex. 플러그인 선언, 컴파일 및 빌드버전 설정, 앱의 식별자 설정, SDK 버전 설정, 앱의 버전 설정 등)
 */