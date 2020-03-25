package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Disease(name : String) {
    var name = name
}
class DiseaseAdapter() : RecyclerView.Adapter<DiseaseAdapter.Companion.DiseaseHolder>() {
    var diseases : Array<Disease> = TrainProgramm.listBroke
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiseaseAdapter.Companion.DiseaseHolder {
        var ddd = LayoutInflater.from(parent.context).inflate(R.layout.disease_view, parent, false)
        return DiseaseHolder(ddd)
    }

    override fun getItemCount(): Int = diseases.size

    override fun onBindViewHolder(holder: DiseaseHolder, position: Int) {
        holder.bind(diseases[position])
    }
    companion object{
        class DiseaseHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
            var n : TextView = itemView.findViewById(R.id.text)
            var b : CheckBox = itemView.findViewById(R.id.ccheck)
            fun bind(disease: Disease){
                b.setOnCheckedChangeListener { buttonView, isChecked ->
                    if (isChecked == true)
                    Profile.disease?.add(disease)
                    if (isChecked == false)
                    Profile.disease?.remove(disease)
                }
                n.setText(disease.name)
            }
        }
    }

}