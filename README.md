first commit

# 1.) 안드로이드 UI

1. manifests
   - 안드로이드 앱의 지도역할을 한다.
   - 어떠한 화면, 어떤 역할을 하는지 알 수 있게 도와 준다.

```code
    <?xml version="1.0" encoding="utf-8"?>
    <manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.geoniljang.androidui"> // 고유한 패키지명 앱의 이름을 적어 주게된다.

        <application // 앱에 대한 내용을 적어 주는 곳
            android:allowBackup="true" // 앱 삭제 후 재설치 했을때 그 앱의 설정 값을 기억 할 수 있도록 하는 옵션 입니다.

            android:icon="@mipmap/ic_launcher" // 앱을 다운로드 했을 때 화면에 보여지는 앱의 아이콘
            android:label="@string/app_name" //앱 이름
            android:roundIcon="@mipmap/ic_launcher_round" // @(경로를 나타내는 키워드) res 파일에 있다.
            android:supportsRtl="true" // 글을 읽는 방향
            android:theme="@style/AppTheme"> // 앱의 테마를 기본값으로 사용하고 있다는 의미를 가진다.

            //Activity는 보여지는 화면을 의미한다.
            <activity android:name=".MainActivity"> //package 아래 있는 MainActivity의 이름

                <intent-filter>
                    <action android:name="android.intent.action.MAIN" />
                    <category android:name="android.intent.category.LAUNCHER" /> // 이 속성은 이 액티비티를 런처 액티비티로 만들어 준다는 의미이며, 화면을 켜면 제일 먼저 보여지는 화면을 설정하는 부분이 된다.
                </intent-filter>


            </activity>
        </application>
    </manifest>
```
