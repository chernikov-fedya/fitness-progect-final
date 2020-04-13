package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.Man.ProfileActivity
import com.example.myapplication.Train.Excercise
import com.example.myapplication.Train.ExerciseAdapter
import com.example.myapplication.Train.MainActivityTrain
import com.example.myapplication.Train.TrainProgramm
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainActivityMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setActionBar(toolbar)
        setContentView(R.layout.activity_main_menu)

        val fragmentAdapter = PagerAdapter(supportFragmentManager)
        fragmentAdapter.data = mutableListOf(mutableListOf(TrainProgramm.listExcercise[4],TrainProgramm.listExcercise[4]),
            mutableListOf(TrainProgramm.listExcercise[4],TrainProgramm.listExcercise[4]),
            mutableListOf(TrainProgramm.listExcercise[4],TrainProgramm.listExcercise[4]))
        viewpager.adapter = fragmentAdapter

        //tabs.setupWithViewPager(viewpager)
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
