package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import android.widget.ArrayAdapter
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main_disease.*
import kotlinx.android.synthetic.main.activity_main_train.*


class MainActivityDisease : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_disease)

        var pip = LinearLayoutManager(this)
        recyclerdis.layoutManager = pip

        var kak = DiseaseAdapter()

        recyclerdis.adapter = kak
    }
    fun disease(v : View){


        var next = Intent(this@MainActivityDisease, MainActivityMenu::class.java)
        next.putExtra("Disease", 1)
        startActivity(next)
    }
}