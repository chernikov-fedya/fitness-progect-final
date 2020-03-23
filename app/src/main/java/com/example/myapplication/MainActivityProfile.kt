package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceActivity
import android.preference.PreferenceScreen
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main_profile.*

//class MainActivityProfile : PreferenceFragmentCompat() {
//    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
//        setPreferencesFromResource(R.xml.preference, rootKey)
//        setPreferenceListener(findPreference<EditTextPreference>(key_name)!!)
//        setPreferenceListener(findPreference<EditTextPreference>(key_weight)!!)
//        setPreferenceListener(findPreference<EditTextPreference>(key_height)!!)
//        setPreferenceListener(findPreference<SwitchPreferenceCompat>(key_age)!!)
//        setPreferenceListener(findPreference<SwitchPreferenceCompat>(key_sex)!!)
//    }
//    companion object{
//        val key_name = "key_name"
//        val key_weight = "key_weight"
//        val key_height = "key_height"
//        val key_age = "key_age"
//        val key_sex = "key_sex"
//
//        fun setPreferenceListener(p : Preference){
//            p.onPreferenceChangeListener = listener
//            if (p is EditTextPreference) {
//                listener.onPreferenceChange(
//                    p,
//                    PreferenceManager.getDefaultSharedPreferences(p.context)
//                        .getString(p.key, "")
//                )
//            }
//        }
//        val listener = Preference.OnPreferenceChangeListener { preference, newValue ->
//            val value = newValue.toString()
//            if (preference is EditTextPreference) {
//                preference.setSummary(value)
//                when (preference.key){
//                    key_name -> Profile.name = preference.summary.toString()
//                    key_weight -> Profile.weight = preference.summary.toString()
//                    key_height -> Profile.height = preference.summary.toString()
//                    key_age -> Profile.age = preference.summary.toString()
//                    key_sex -> Profile.sex = preference.summary.toString()
//                }
//            }
//            return@OnPreferenceChangeListener true
//        }
//    }
//
//
//}
//override fun onCreate(savedInstanceState: Bundle?) {
////    super.onCreate(savedInstanceState)
////    setContentView(R.layout.activity_main_profile)
////    var array: Array<String> = arrayOf(
////        ("Ваше имя: " + Profile.Name.toString()),
////        ("Ваш вес:" + Profile.Weight.toString()), ("Ваш рост: " + Profile.Height.toString()),
////        ("Ваш возраст: " + Profile.Age.toString()), ("Ваш пол: " + Profile.Sex)
////    )
////
////    listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
//
//}