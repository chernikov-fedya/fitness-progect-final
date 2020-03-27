package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_desc.*
import kotlin.properties.Delegates

class Desc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)
        var ag = intent.extras?.get("a") as String
        viewdesc.text = ag


        //n = intent.extras?.get("a") as Excercise
        //var s:Int = intent.getIntExtra("a", 0)
    }


}




