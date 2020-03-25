package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Muscle(name: String) {
    var name = name

}
class ChooseAdapter(): RecyclerView.Adapter<ChooseAdapter.Companion.ChooseHolder>() {
    var chooses : Array<Muscle> = TrainProgramm.listMuscle
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseAdapter.Companion.ChooseHolder {
        var ddd = LayoutInflater.from(parent.context).inflate(R.layout.disease_view, parent, false)
        return ChooseHolder(ddd)
    }

    override fun getItemCount(): Int = chooses.size

    override fun onBindViewHolder(holder: ChooseHolder, position: Int) {
        holder.bind(chooses[position])
    }
    companion object{
        class ChooseHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
            var n : TextView = itemView.findViewById(R.id.text)
            var b : CheckBox = itemView.findViewById(R.id.ccheck)
            fun bind(muscle: Muscle){
                b.setOnCheckedChangeListener { buttonView, isChecked ->
                    if (isChecked == true)
                        Profile.choose.add(muscle)
                    if (isChecked == false)
                        Profile.choose.remove(muscle)
                }
                n.setText(muscle.name)
            }
        }
    }

}