package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RelativeLayout
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
            var b : CheckBox = itemView.findViewById(R.id.ccheckk)
            var l : RelativeLayout = itemView.findViewById(R.id.root_desease)
            fun bind(disease: Disease){
                b.setOnCheckedChangeListener { buttonView, isChecked ->
                    if (isChecked)
                    Profile.disease?.add(disease)
                    else
                    Profile.disease?.remove(disease)

                }
                l.setOnClickListener { v ->
                    b.isChecked = !b.isChecked
                }
                n.setText(disease.name)
            }
        }
    }

}