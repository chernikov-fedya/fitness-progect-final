package com.example.myapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.preference.EditTextPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.profile_layout.*


class ProfileActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        var f = PreferenceProfileFragment()
        ft.add(R.id.fragment_frame, f)
        ft.commit()

    }

}


class PreferenceProfileFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference, rootKey)
        setPreferenceListener(findPreference<EditTextPreference>(key_log)!!)
        setPreferenceListener(findPreference<EditTextPreference>(key_pass)!!)
        setPreferenceListener(findPreference<EditTextPreference>(key_name)!!)
        setPreferenceListener(findPreference<EditTextPreference>(key_weight)!!)
        setPreferenceListener(findPreference<EditTextPreference>(key_height)!!)
        setPreferenceListener(findPreference<EditTextPreference>(key_age)!!)
        setPreferenceListener(findPreference<EditTextPreference>(key_sex)!!)
    }

    companion object{
        val key_log = "key_log"
        val key_pass = "key_pass"
        val key_name = "key_name"
        val key_weight = "key_weight"
        val key_height = "key_height"
        val key_age = "key_age"
        val key_sex = "key_sex"

        fun setPreferenceListener(p : Preference){
            p.onPreferenceChangeListener = listener
            if (p is EditTextPreference) {
                listener.onPreferenceChange(
                    p,
                    PreferenceManager.getDefaultSharedPreferences(p.context)
                        .getString(p.key, "")
                )
            }
        }
        val listener = Preference.OnPreferenceChangeListener { preference, newValue ->
            val value = newValue.toString()
            if (preference is EditTextPreference) {
                preference.setSummary(value)
                when (preference.key){
                    key_log -> preference.summary = Profile.login
                    key_pass -> preference.summary = Profile.password
                    key_name -> preference.summary = Profile.name
                    key_weight -> preference.summary = Profile.weight
                    key_height ->  preference.summary = Profile.height
                    key_age ->  preference.summary = Profile.age
                    key_sex -> preference.summary = Profile.sex
                }
            }
            return@OnPreferenceChangeListener true
        }
    }

}
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main_profile)
//    var array: Array<String> = arrayOf(
//        ("Ваше имя: " + Profile.Name.toString()),
//        ("Ваш вес:" + Profile.Weight.toString()), ("Ваш рост: " + Profile.Height.toString()),
//        ("Ваш возраст: " + Profile.Age.toString()), ("Ваш пол: " + Profile.Sex)
//    )
//
//    listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
//
//}