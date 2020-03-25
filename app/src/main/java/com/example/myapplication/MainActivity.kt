package com.example.myapplication

import android.content.Intent
import android.os.Build.VERSION_CODES.P
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.preference.EditTextPreference
import androidx.preference.Preference
import kotlinx.android.synthetic.main.activity_light_login.*
import kotlinx.android.synthetic.main.activity_light_login.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_light_login)
    }
    fun insert(v : View){
        if (P.toString() == log.text.toString() && PreferenceProfileFragment.key_pass == pas.text.toString()){
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
