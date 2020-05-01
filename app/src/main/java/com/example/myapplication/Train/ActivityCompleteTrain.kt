package com.example.myapplication.Train

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Man.Muscle
import com.example.myapplication.Man.Profile
import com.example.myapplication.PagerAdapter
import com.example.myapplication.PagerAdapter1
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_complete_train.*
import kotlinx.android.synthetic.main.activity_main_train.*

class ActivityCompleteTrain : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_train)

        var cont = PagerAdapter1(supportFragmentManager)
        vlad.adapter = cont
    }
}
