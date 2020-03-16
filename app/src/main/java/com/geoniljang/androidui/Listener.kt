package com.geoniljang.androidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_listener.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textView
import java.util.*

class Listener : AppCompatActivity() {

    var number : Int = 0;

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


        // 뷰를 조작하는 함수들
        textView.setText("안녕하세요 만나서 반가워요")
        image.setImageResource(R.drawable.ic_launcher_foreground)
        image.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                textView.setText("${number++}")
            }
        })



    }

}
