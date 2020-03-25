package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlin.properties.Delegates

class Desc : AppCompatActivity() {
    var n: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)
        if (intent.extras?.get("a") != null)
            n = intent.extras?.get("a").toString().toInt()

        n = intent.extras?.get("a").toString().toInt()
        //var s:Int = intent.getIntExtra("a", 0)
    }


}




