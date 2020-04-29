package com.example.myapplication.Registr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.Man.Profile
import com.example.myapplication.R
import com.example.myapplication.Timeline
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import kotlinx.android.synthetic.main.activity_light_registr.*


class MainActivityRegistr : AppCompatActivity() {
    var mAuth = FirebaseAuth.getInstance()

    lateinit var mDatabase: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_light_registr)


        mDatabase = FirebaseDatabase.getInstance().getReference("Names")

        /*val regBtn = findViewById<View>(R.id.logAc) as Button

        regBtn.setOnClickListener(View.OnClickListener {
            view -> register()
        })*/
    }

     fun register(v: View) {
        val emailTxt = findViewById<View>(R.id.login) as EditText
        val passwordTxt = findViewById<View>(R.id.password) as EditText
        val nameTxt = findViewById<View>(R.id.name) as EditText

        var email = emailTxt.text.toString()
        var password = passwordTxt.text.toString()
        var name = nameTxt.text.toString()
         Profile.login = email
         Profile.password = password
         Profile.name = name
         Profile.height = height.text.toString()
         Profile.weight = weight.text.toString()
         Profile.age = age.text.toString()
         if (radioButton_male.isChecked == true)
             Profile.sex = "Мужчина"
         if (radioButton_female.isChecked == true)
             Profile.sex = "Женщина"


        if (!email.isEmpty() && !password.isEmpty() && !name.isEmpty()) {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, OnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = mAuth.currentUser
                    val uid = user!!.uid
                    mDatabase.child(uid).child("Names").setValue(name)
                    startActivity(Intent(this, Timeline::class.java))
                    Toast.makeText(this, "Successfully registered :)", Toast.LENGTH_LONG).show()
                }else {
                    Toast.makeText(this, "Error registering, try again later :(", Toast.LENGTH_LONG).show()
                }
            })
        }else {
            Toast.makeText(this,"Please fill up the Credentials :|", Toast.LENGTH_LONG).show()
        }

    }

    fun back(v: View){
        onBackPressed()
    }
    fun display(v : View) {
        Profile.login = login.text.toString()
        Profile.password = password.text.toString()
        Profile.name = name.text.toString()
        Profile.height = height.text.toString()
        Profile.weight = weight.text.toString()
        Profile.age = age.text.toString()
        if (radioButton_male.isChecked == true)
            Profile.sex = "Мужчина"
        if (radioButton_female.isChecked == true)
            Profile.sex = "Женщина"
        var next: Intent = Intent(this@MainActivityRegistr, MainActivityDisease::class.java)
        next.putExtra("login", Profile.login)
        startActivity(next)
    }
}
