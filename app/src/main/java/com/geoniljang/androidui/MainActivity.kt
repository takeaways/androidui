package com.geoniljang.androidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Life Cycle","Call onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Life Cycle","Call onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life Cycle","Call onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Life Cycle","Call onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Life Cycle","Call onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life Cycle","Call onDestroy")

    }



}
