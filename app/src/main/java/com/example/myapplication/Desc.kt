package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlin.properties.Delegates

class Desc : AppCompatActivity() {
    lateinit var n: Excercise
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)


        n = intent.extras?.get("a") as Excercise
        //var s:Int = intent.getIntExtra("a", 0)
    }


}




