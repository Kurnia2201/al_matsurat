package com.example.al_matsurat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.al_matsurat.R
import com.example.al_matsurat.model.ModelDzikir


class ZisensuAdapter(private val zisensuCard: ArrayList<ModelDzikir>) :
    RecyclerView.Adapter<ZisensuAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textTitle: TextView = itemView.findViewById(R.id.titleZikir)
        var textArab: TextView = itemView.findViewById(R.id.arabicZikir)
        var textLatin: TextView = itemView.findViewById(R.id.latinZikir)
        var textTerjemah: TextView = itemView.findViewById(R.id.terjemahanZikir)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dzikir, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dzikir = zisensuCard[position]
        holder.textTitle.text = dzikir.title
        holder.textArab.text = dzikir.arabic
        holder.textLatin.text = dzikir.latin
        holder.textTerjemah.text = dzikir.desc

    }

    override fun getItemCount(): Int {
        return zisensuCard.size
    }

}