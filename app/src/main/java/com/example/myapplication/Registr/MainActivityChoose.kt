package com.example.myapplication.Registr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.MainActivityMenu
import com.example.myapplication.Man.MuscleGroupAdapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main_choose.*

class MainActivityChoose : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_choose)
        var pip = LinearLayoutManager(this)
        recycler1.layoutManager = pip
        var kak = MuscleGroupAdapter()

        recycler1.adapter = kak

    }

    fun go1(v: View) {
        var next = Intent(this@MainActivityChoose, MainActivityMenu::class.java)
        startActivity(next)
    }
    fun back(v: View){
        onBackPressed()
    }
}