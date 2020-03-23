package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_disease.*


class MainActivityDisease : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_disease)
    }
    fun disease(v : View){
        if(radioButton_health.isChecked == true) {
            Profile.disease = null
        }
        else {
            if (radioButton_hands.isChecked == true) {
                Profile.disease = TrainProgramm.listBroke[0]
            } else {
                Profile.disease = TrainProgramm.listBroke[1]
            }
        }
        var next = Intent(this@MainActivityDisease, MainActivityMenu::class.java)
        next.putExtra("Disease", 1)
        startActivity(next)
    }
}
