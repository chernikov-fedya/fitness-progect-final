package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MondayFragment()
            1 -> TuesdayFragment()
            2 -> WednesdayFragment()
            3 -> ThursdayFragment()
            4 -> FridayFragment()
            5 -> SaturdayFragment()
            else -> {
                return SundayFragment()
            }
        }
    }
    override fun getCount(): Int {
        return 6
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Monday Fragment"
            1 -> "Tuesday Fragment"
            2 -> "Wednesday Fragment"
            3 -> "Thursday Fragment"
            4 -> "Friday Fragment"
            5 -> "Saturday Fragment"
            else -> {
                return "Sunday Fragment"
            }
        }
    }
}