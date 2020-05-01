package com.example.myapplication.Train

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Man.Muscle
import com.example.myapplication.Man.Profile
import com.example.myapplication.PagerAdapter
import com.example.myapplication.R
import com.example.myapplication.Registr.MainActivityRegistr
import kotlinx.android.synthetic.main.activity_main_train.*

class MainActivityTrain : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_train)

        val fragmentAdapter = PagerAdapter(supportFragmentManager)
        viewpager.adapter = fragmentAdapter
    }
    fun back(v: View){
        onBackPressed()
    }
    fun cTrain(v:View){
        var next = Intent(this, ActivityCompleteTrain::class.java)
        startActivity(next)
    }


}
