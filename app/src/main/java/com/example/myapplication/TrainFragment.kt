package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Train.Excercise

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
        var recycler : RecyclerView = ret.findViewById(R.id.trainFragment)



        return ret
    }


}
