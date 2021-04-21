package com.example.al_matsurat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.al_matsurat.R
import com.example.al_matsurat.model.ModelDzikir
import kotlinx.android.synthetic.main.item_dzikir.view.*

class AdapterPagiSughro(private val array: ArrayList<ModelDzikir>) :
    RecyclerView.Adapter<AdapterPagiSughro.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvJudul: TextView = itemView.findViewById(R.id.judulPagiSughro)
        var tvArabic: TextView = itemView.findViewById(R.id.arabicPagiSughro)
        var tvLatin: TextView = itemView.findViewById(R.id.latinPagiSughro)
        var tvDesc: TextView = itemView.findViewById(R.id.descPagiSughro)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dzikir, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dzikirZipasu = array[position]
        holder.tvJudul.text = dzikirZipasu.title
        holder.tvArabic.text = dzikirZipasu.arabic
        holder.tvLatin.text = dzikirZipasu.latin
        holder.tvDesc.text = dzikirZipasu.desc
    }

    override fun getItemCount(): Int = array.size
}