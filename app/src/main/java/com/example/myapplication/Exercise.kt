package com.example.myapplication

class Excercise(val name: String?, var muscleGroup: Array<Muscle>,var imbDownLimit: Float? = null , var imbLimit: Float? = null) {
    //var defaultRest: Double = 30.0
    //var podxod: Int? = null
    //var povtor: Int? = null
    //var imbLimit: Float? = null
    var trainingWeight: Double = 1.0 // здесь стандартный начальный вес для упражнения
    /*fun restPlus() {
    println("Достаточно ли времени на отдых: Y-YES, N-NOW")
    var o: String = readLine()!!
    when (o) {
        "Y", "YES", "y", "yes" -> return
        else -> defaultRest = defaultRest + defaultRest * 0.2
    }
}*/

    /*fun havearest() {
        println("Отдохни $defaultRest секунд")
    }*/
    var diseases: Array<Disease> = arrayOf()

    fun checkDiseases(disease: Disease) = diseases.find { it ==  disease } == null
}