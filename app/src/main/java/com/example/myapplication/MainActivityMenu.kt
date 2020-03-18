package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivityMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }
    fun profile(v : View){
        var next:Intent = Intent(this@MainActivityMenu, MainActivityProfile::class.java )
        next.putExtra("Registr", 1)
        startActivity(next)
    }
    fun make(v : View){
        var next1:Intent = Intent(this@MainActivityMenu, MainActivityTrain::class.java)
        next1.putExtra("Train", 1)
        startActivity(next1)
    }
}
