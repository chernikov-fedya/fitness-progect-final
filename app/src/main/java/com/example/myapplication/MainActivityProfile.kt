package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main_profile.*

class MainActivityProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile)
        var array: Array<String> = arrayOf(("Ваше имя: " + Profile.Name.toString()),
            ("Ваш вес:" + Profile.Weight.toString()),("Ваш рост: " + Profile.Height.toString()),
            ("Ваш возраст: " + Profile.Age.toString()),("Ваш пол: " + Profile.Sex))

        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)

    }
}
