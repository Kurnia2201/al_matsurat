package com.example.al_matsurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.al_matsurat.adapter.ZipasuAdapter
import com.example.al_matsurat.data.DataPagiSughro
import com.example.al_matsurat.model.ModelDzikir

class ZipasuActivity : AppCompatActivity() {
    private lateinit var rvDzikir: RecyclerView
    private var list: ArrayList<ModelDzikir> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zipasu)
        rvDzikir = findViewById(R.id.rv_zipasu)
        rvDzikir.setHasFixedSize(true)
        list.addAll(DataPagiSughro.listData)
        showRecylerZipasu()

    }

    private fun showRecylerZipasu() {
        rvDzikir.layoutManager = LinearLayoutManager(this)
        val linearZipasu = ZipasuAdapter()
        rvDzikir.adapter = linearZipasu
    }
}