package com.example.myapplication

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main_train.*

class MainActivityTrain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_train)
        var ddisease : List<Disease>? = listOf(Profile.Disease!!)

        listVV.adapter = ArrayAdapter<Excercise>(this, simple_list_item_1, TrainProgramm.checkExercise(ddisease))
    }
}
