package com.geoniljang.androidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class Listener : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        // 아래와 같은 방법으로 뷰객체에 접근이 가능하나 코틀린의 경우는 다음과 같이 아이디로만 접근도 가능하다, 그렇게 접그하기위해서는 xml을 import 해줘야 한다.
//        val textView : TextView = findViewById<TextView>(R.id.textView)
        textView.text = "I know Your Jang Geonil"
        textView.setOnClickListener{
            Log.d("click", "CLICK ME lambda")
        }

        textView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "CLICK ME object")
            }
        });

        class ClickListner : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "Hello from the other side")
            }
        }

        val listner = ClickListner()
        textView.setOnClickListener(listner)


    }

}
