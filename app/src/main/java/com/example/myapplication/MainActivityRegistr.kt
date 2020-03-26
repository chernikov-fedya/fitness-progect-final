package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_light_registr.*


class MainActivityRegistr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_light_registr)
    }

    fun display(v : View) {
        Profile.login = login.text.toString()
        Profile.password = password.text.toString()
        Profile.name = name.text.toString()
        Profile.height = height.text.toString()
        Profile.weight = weight.text.toString()
        Profile.age = age.text.toString()
        if (radioButton_male.isChecked == true)
            Profile.sex = "Мужчина"
        if (radioButton_female.isChecked == true)
            Profile.sex = "Женщина"
        var next: Intent = Intent(this@MainActivityRegistr, MainActivityDisease::class.java)
        next.putExtra("login",Profile.login)
        startActivity(next)
    }
    fun back(v: View){
        onBackPressed()
    }
}
