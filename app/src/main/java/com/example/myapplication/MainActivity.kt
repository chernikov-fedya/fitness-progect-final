package com.example.myapplication

import android.content.Intent
import android.os.Build.VERSION_CODES.P
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.Man.Profile
import com.example.myapplication.Registr.MainActivityRegistr
import kotlinx.android.synthetic.main.activity_light_login.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_light_login)

        setActionBar(toolbar)
    }
    fun insert(v : View){
        if (P.toString() == log.text.toString() && P.toString() == pas.text.toString()){
            var next:Intent = Intent(this@MainActivity, MainActivityMenu::class.java)
            next.putExtra("HaveLog", Profile.login)
            startActivity(next)

        }

    }
    fun regist(v : View) {
        var next: Intent = Intent(this@MainActivity, MainActivityRegistr::class.java)
        next.putExtra("Registr", 1)
        startActivity(next)
    }
}
