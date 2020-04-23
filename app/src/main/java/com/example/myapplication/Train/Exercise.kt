package com.example.myapplication.Train

import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Man.Disease
import com.example.myapplication.Man.Muscle
import com.example.myapplication.R

class Excercise(
    val name: String?,
    val opisanie: String?,
    var muscleGroup: Array<Muscle>? = null,
    var imbDownLimit: Float? = null,
    var imbLimit: Float? = null
) {
    var raiting = 0.0
    //var defaultRest: Double = 30.0
    var q: Double? = null // Коэффицент для расчёта сложности упражнения
    var podxod: Int? = null
    var povtor: Int? = null
    var trainingWeight: Double = 20.0 // здесь стандартный начальный вес для упражнения
    /*fun restPlus() {
    println("Достаточно ли времени на отдых: Y-YES, N-NOW")
    var o: String = readLine()!!

    +
    when (o) {
        "Y", "YES", "y", "yes" -> return
        else -> defaultRest = defaultRest + defaultRest * 0.2
    }
}*/

    /*fun havearest() {
        println("Отдохни $defaultRest секунд")
    }*/
    override fun toString(): String {
        return "$name"
    }
    fun prString(): String {
        return "$name $podxod $povtor $trainingWeight"
    }
    fun plusweight(){
        println("Сделайте разминочный подход (20 раз) с весом $trainingWeight " + "\n"
                + "Вам должно быть нетяжело и нелегко : Y-YES, U - UpWeight, D - DownWeight" + "\n"
                + "Вес вашей штанги: $trainingWeight")
        var o: String = readLine()!!.toString()
        when (o) {
            "Y", "YES", "y", "yes" -> return
            "U", "u", "Up", "UP", "up", "uP" -> trainingWeight = trainingWeight + 2.5
            "D", "d", "Down", "DOWN" -> trainingWeight = trainingWeight - 2.5
        }
        println("Ваш вес стал: $trainingWeight")
        plusweight()
    }
    var diseases: Array<Disease> = arrayOf()
    var muscles = muscleGroup?.toMutableList()

    fun checkDiseases(disease: Disease) = diseases.find { it ==  disease } == null

    //fun checkChoose(muscle: Muscle) = muscleGroup.find { it != muscle } != null

    }
    @RequiresApi(Build.VERSION_CODES.N)
    var abd = TrainProgramm.qwerty()

class ExerciseAdapter(): RecyclerView.Adapter<ExerciseAdapter.Companion.ExerciseHolder>(){
    var excercises : MutableList<Excercise> = mutableListOf()
    lateinit var c : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHolder {
        var eee = LayoutInflater.from(parent.context).inflate(R.layout.exercise_view, parent, false)
        return ExerciseHolder(
            eee
        )
    }

    override fun getItemCount(): Int = excercises.size

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: ExerciseHolder, position: Int) {
        holder.n.setOnClickListener { v ->
            var next = Intent(c, Desc::class.java)
            var mna : ArrayList<String> = arrayListOf("","","","","","","","","","","","","","","","","","","","","")
            for (i in 0..TrainProgramm.qwerty().size-1){
               // mna?.set(i, abd[i].name.toString())
                mna[i] = TrainProgramm.qwerty()[i].opisanie.toString()
            }
            next.putExtra("a", mna[position])
            c.startActivity(next)
        }
        holder.bind(excercises[position])
    }
    companion object{
        class ExerciseHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var n : TextView = itemView.findViewById(R.id.name_ex)

            fun bind(excercise: Excercise){
                n.setText(excercise.name)
            }
        }
    }
}

//class ExerciseAdapter1(): RecyclerView.Adapter<ExerciseAdapter1.Companion.ExerciseHolder1>(){
//    var excercises : MutableList<Excercise> = mutableListOf()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHolder1 {
//        var eee = LayoutInflater.from(parent.context).inflate(R.layout.complete_exersice_view, parent, false)
//        return ExerciseHolder1(eee)
//    }
//
//    override fun getItemCount(): Int = excercises.size
//
//    override fun onBindViewHolder(holder: ExerciseHolder1, position: Int) {
//        holder.bind(excercises[position])
//    }
//    companion object{
//        class ExerciseHolder1(itemView: View) : RecyclerView.ViewHolder(itemView){
//            var n : TextView = itemView.findViewById(R.id.name_ex)
//            var pov : TextView = itemView.findViewById(R.id.pov_ex)
//            var pod : TextView = itemView.findViewById(R.id.pod_ex)
//            fun bind(excercise: Excercise){
//                n.setText(excercise.name)
//                pov.setText("Подходы: " + excercise.podxod.toString())
//                pod.setText("Повторы: " + excercise.povtor.toString())
//            }
//        }
//    }
//
//}