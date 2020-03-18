package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main_disease.*
import kotlinx.android.synthetic.main.activity_main_registr.view.*

class MainActivityDisease : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_disease)
    }
    fun disease(v : View){
        if(radioButton_hands.isChecked == true){
            Profile.Disease = Disease("Нет рук")
        }
        else{
            Profile.Disease = Disease("Нет ног")
        }

        var next = Intent(this@MainActivityDisease, MainActivityMenu::class.java)
        next.putExtra("Disease", 1)
        startActivity(next)
    }
}
