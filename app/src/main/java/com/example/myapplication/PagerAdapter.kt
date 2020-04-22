package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.DayFragment.*
import com.example.myapplication.Train.Excercise
import com.example.myapplication.Train.TrainProgramm

@RequiresApi(Build.VERSION_CODES.N)
class PagerAdapter (fm: FragmentManager):
    FragmentPagerAdapter(fm){
    @RequiresApi(Build.VERSION_CODES.N)
    var data : MutableList<MutableList<Excercise>>?
    init {
        //TrainProgramm.checkExerciseChoose()
        data  = TrainProgramm.createTrain(TrainProgramm.checkExerciseChoose(), 3, 6 )
    }
    override fun getItem(position: Int): Fragment {
        return TrainFragment.newInstance(data?.get(position)?: mutableListOf())

//        return when (position) {
//            0 -> MondayFragment()
//            1 -> TuesdayFragment()
//            2 -> WednesdayFragment()
//            3 -> ThursdayFragment()
//            4 -> FridayFragment()
//            5 -> SaturdayFragment()
//            else -> {
//                return TrainFragment()
//            }
//        }
    }
    override fun getCount(): Int {
        return data?.size ?: 0
    }
    override fun getPageTitle(position: Int): CharSequence? {
            return "Тренировочный день"

//        return when (position){
//            0 -> "Monday Fragment"
//            1 -> "Tuesday Fragment"
//            2 -> "Wednesday Fragment"
//            3 -> "Thursday Fragment"
//            4 -> "Friday Fragment"
//            5 -> "Saturday Fragment"
//            else -> {
//                return "Sunday Fragment"
//            }
//        }
    }
}