package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.Man.ProfileActivity
import com.example.myapplication.Train.MainActivityTrain
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainActivityMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setActionBar(toolbar)
        val actionBar = supportActionBar


        setContentView(R.layout.activity_main_menu)

        val fragmentAdapter = PagerAdapter(supportFragmentManager)
        viewpager.adapter = fragmentAdapter

        tabs.setupWithViewPager(viewpager)
    }   
    fun profile(v : View){
        var next:Intent = Intent(this@MainActivityMenu, ProfileActivity::class.java )
        next.putExtra("Registr", 1)
        startActivity(next)
    }
    fun make(v : View){
        var next1:Intent = Intent(this@MainActivityMenu, MainActivityTrain::class.java)
        next1.putExtra("Train", 1)
        startActivity(next1)
    }
    fun back(v: View){
        onBackPressed()
    }
}
