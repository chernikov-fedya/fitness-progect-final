package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MuscleGroup(name: String, muscles: Array<Muscle>) {
    var name = name
    var muscles = muscles
    override fun toString(): String {
        return "$name"
    }

}
class MuscleGroupAdapter() : RecyclerView.Adapter<MuscleGroupAdapter.Companion.MuscleGroupHolder>() {
    var muscles: List<MuscleGroup> = TrainProgramm.listchoose
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MuscleGroupAdapter.Companion.MuscleGroupHolder {
        var zzz = LayoutInflater.from(parent.context).inflate(R.layout.choose_view, parent, false)
        return MuscleGroupHolder(zzz)
    }

    override fun getItemCount(): Int = muscles.size

    override fun onBindViewHolder(holder: MuscleGroupHolder, position: Int) {
        holder.bind(muscles[position])
    }

    companion object {
        class MuscleGroupHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var n: TextView = itemView.findViewById(R.id.evol)
            var b: CheckBox = itemView.findViewById(R.id.love)
            var l : RelativeLayout = itemView.findViewById(R.id.root_desease)
            fun bind(muscle: MuscleGroup) {
                b.setOnCheckedChangeListener { buttonView, isChecked ->
                    if (isChecked)
                        Profile.choose?.add(muscle)
                    else
                        Profile.choose?.remove(muscle)

                }
                l.setOnClickListener { v ->
                    b.isChecked = !b.isChecked
                }
                n.setText(muscle.name)
            }
        }
    }
}