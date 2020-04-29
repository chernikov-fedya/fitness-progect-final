package com.example.myapplication.Man

object Profile {
    var password: String? = null
    var login: String? = null
    var name: String? = null
    var height: String = "0"
    var weight: String = "0"
    var age: String? = null
    var sex: String? = null
    var disease: MutableList<Disease> = mutableListOf()
    var choose: MutableList<MuscleGroup>? = null
    var IMB : Double = weight.toDouble()/((height.toDouble()/100)* (height.toDouble()/100))
    var rating : Double = 1000.0
}
