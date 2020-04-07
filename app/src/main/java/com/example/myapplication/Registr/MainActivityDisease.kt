package com.example.myapplication.Registr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Man.DiseaseAdapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main_disease.*


class MainActivityDisease : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_disease)


        var pip = LinearLayoutManager(this)
        recyclerdis.layoutManager = pip
        var kak = DiseaseAdapter()

        recyclerdis.adapter = kak
    }

    fun disease(v: View) {
        var next = Intent(this@MainActivityDisease, MainActivityChoose::class.java)
        next.putExtra("Disease", 1)
        startActivity(next)
    }
    fun back(v: View){
        onBackPressed()
    }
}
