package com.example.myapplication

import android.content.Intent
import android.os.Build.VERSION_CODES.P
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.Man.Profile
import com.example.myapplication.Registr.MainActivityRegistr
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_light_login.*

class MainActivity : AppCompatActivity() {

    var mAuth = FirebaseAuth.getInstance()
    lateinit var mDatabase : DatabaseReference
    var user = FirebaseAuth.getInstance().currentUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_light_login)

        setActionBar(toolbar)

        var uid = user?.uid

        mDatabase = FirebaseDatabase.getInstance().getReference("Names")

        if (uid != null) {
            mDatabase.child(uid).child("Names").addValueEventListener( object : ValueEventListener {
                override fun onCancelled(p0: DatabaseError) {

                }

                override fun onDataChange(snapshot: DataSnapshot) {
                    Profile.name = snapshot.value.toString()
                }
            })
        }
       /* val loginBtn = findViewById<View>(R.id.`in`) as Button

        val regTxt = findViewById<View>(R.id.txt) as TextView

        loginBtn.setOnClickListener(View.OnClickListener {
            view -> login()
        })

        regTxt.setOnClickListener(View.OnClickListener {
            view -> register()
        })*/
    }

    fun login (v: View) {
        val emailTxt = findViewById<View>(R.id.log) as EditText
        var email = emailTxt.text.toString()
        val passwordTxt = findViewById<View>(R.id.pas) as EditText
        var password = passwordTxt.text.toString()
        Profile.login = email
        Profile.password = password


        if (!email.isEmpty() && !password.isEmpty()) {
            this.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener ( this, OnCompleteListener<AuthResult> { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this, Timeline::class.java))
                    Toast.makeText(this, "Successfully Logged in :)", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Error Logging in :(", Toast.LENGTH_SHORT).show()
                }
            })

        }else {
            Toast.makeText(this, "Please fill up the Credentials :|", Toast.LENGTH_SHORT).show()
        }
    }
    fun register(v: View){
        startActivity(Intent(this, MainActivityRegistr::class.java))
    }

}
