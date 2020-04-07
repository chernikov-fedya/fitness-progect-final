package com.example.myapplication.Train

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Man.Muscle
import com.example.myapplication.Man.Profile
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main_train.*

class MainActivityTrain : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_train)

        var pi = LinearLayoutManager(baseContext)
        recycler.layoutManager = pi
        var ka = ExerciseAdapter()
        ka.c = this
        if (Profile.choose != null) {
            var cchoose : List<Muscle>? = listOf()
            for (i in 0..(Profile.choose?.size!! - 1))
            cchoose = cchoose?.plus(Profile.choose!![i].muscles.toList())

            ka.excercises = TrainProgramm.checkExerciseChoose(cchoose)
        }
        else{
            var cchoose: List<Muscle>? = null
            ka.excercises = TrainProgramm.checkExerciseChoose(cchoose)
        }
        recycler.adapter = ka
    }
    fun back(v: View){
        onBackPressed()
    }

}
