package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        if (Profile.disease != null) {
            var ddisease: List<Disease>? = Profile.disease!!
            ka.excercises = TrainProgramm.checkExercise(ddisease)
        }
        else{
            var ddisease: List<Disease>? = listOf()
            ka.excercises = TrainProgramm.checkExercise(ddisease)
        }
        recycler.adapter = ka

    }

}
