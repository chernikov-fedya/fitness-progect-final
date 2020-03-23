package com.example.myapplication

import android.R.layout.simple_list_item_1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main_train.*

class MainActivityTrain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_train)
        var pi = LinearLayoutManager(baseContext)
        recycler.layoutManager = pi
        var ka = ExerciseAdapter()
        ka.c = this
        if (Profile.Disease != null) {
            var ddisease: List<Disease>? = listOf(Profile.Disease!!)
            ka.excercises = TrainProgramm.checkExercise(ddisease)
        }
        else{
            var ddisease: List<Disease>? = listOf()
            ka.excercises = TrainProgramm.checkExercise(ddisease)
        }
        recycler.adapter = ka

    }

}
