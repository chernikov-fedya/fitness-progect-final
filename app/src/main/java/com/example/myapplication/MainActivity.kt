package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_black_login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_black_login)
    }
    fun insert(v : View){
        if (Profile.Login == log.text.toString() && Profile.Password == pas.text.toString()){
            var next:Intent = Intent(this@MainActivity, MainActivityMenu::class.java)
            next.putExtra("HaveLog", Profile.Login)
            startActivity(next)
            }
    }
    fun regist(v : View){
        var next:Intent = Intent(this@MainActivity, MainActivityRegistr::class.java)
        next.putExtra("Registr", 1)
        startActivity(next)
    }

}
