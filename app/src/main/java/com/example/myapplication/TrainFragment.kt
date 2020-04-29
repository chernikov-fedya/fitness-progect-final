package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Train.Excercise
import com.example.myapplication.Train.ExerciseAdapter
import com.example.myapplication.Train.ExerciseAdapter1
import kotlinx.android.synthetic.main.activity_main_train.*

class TrainFragment : Fragment() {

    companion object{
        fun newInstance(excer: MutableList<Excercise>): TrainFragment {
            var temp = TrainFragment()
            temp.excer = excer
            return temp
        }
    }

    var excer: MutableList<Excercise> =  mutableListOf()
    /* var TrainDay: MutableList<String> = mutableListOf("Отжимания", "Выпрыгивание", "Приседания")*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var ret = inflater.inflate(R.layout.fragment_train, container, false)

        //закомментил это чудо, с ним не запускалось
        //var recycler : RecyclerView = ret.findViewById(R.id.trainFragment)
        var recycler : RecyclerView = ret.findViewById(R.id.misha)
        recycler.adapter = ExerciseAdapter().apply {
            excercises = excer
        }
        var pi = LinearLayoutManager(ret.context)
        recycler.layoutManager = pi
        return ret
    }


}
class TrainFragment1 : Fragment() {

    companion object{
        fun newInstance(excer: MutableList<Excercise>): TrainFragment1 {
            var temp = TrainFragment1()
            temp.excer = excer
            return temp
        }
    }

    var excer: MutableList<Excercise> =  mutableListOf()
    /* var TrainDay: MutableList<String> = mutableListOf("Отжимания", "Выпрыгивание", "Приседания")*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var ret1 = inflater.inflate(R.layout.fragment_comp, container, false)

        //закомментил это чудо, с ним не запускалось
        //var recycler : RecyclerView = ret.findViewById(R.id.trainFragment)
        var recycler : RecyclerView = ret1.findViewById(R.id.qwertyu)
        recycler.adapter = ExerciseAdapter1().apply {
            excercises = excer
        }
        var pi1 = LinearLayoutManager(ret1.context)
        recycler.layoutManager = pi1
        return ret1
    }


}
