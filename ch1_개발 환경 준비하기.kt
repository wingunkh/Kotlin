package com.example.kimhyungeun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
} //Create New Project 시 자동으로 생성되는 코틀린 코드. 아직 해석이 불가능하다.

/*
    안드로이드 스튜디오
    : 안드로이드 스튜디오는 안드로이드 전용 앱을 개발하는 도구로 구글이 2013년 처음 발표했다.
    안드로이드 스튜디오로 개발한 앱을 실행하려면 실제 스마트폰을 이용해도 되지만 안드로이드 스튜디오에서 제공하는
    '안드로이드 가상 기기, AVD' 를 이용할 수 있다. 흔히 '에뮬레이터'라고 부른다.

    배포파일
    : 사용자가 앱을 설치하면 개발자가 등록한 배포파일을 내려받게 된다.
    안드로이드 앱의 배포파일은 APK와 AAB가 있다.
    AAB는 2018년 구글IO에서 발표했으며 Play 스토어에 올리면 사용자 기기에 맞게 최적화된 APK를 대신 만들어준다.
    2021년 8월부터 Play 스토어가 새로운 앱을 게시할 때 AAB파일만 사용해야 한다고 발표한 바 있다.

    앱 서명
    : 안드로이드 배포파일을 만드려면 키를 만들어 앱에 서명해야 한다.
    서명키를 개발자가 직접 관리하는 방법도 있지만 분실과 도용 시 대처 방법이 전무하기 때문에
    구글에서 제공하는 'Play 앱 서명' 이라는 서비스를 이용하게 된다.
    구글 Play 앱 서명 방식은 키를 2개로 구분하는데
    개발자가 만들고 관리하는 '업로드 키' , 구글 Play가 만드는 '앱 서명 키'가 있다.
    '업로드 키'는 구글 Play에 등록할 때만 사용되고 그 후 구글 Play가 자체적으로 '앱 서명 키'를 만들어서 전달한다.
*/