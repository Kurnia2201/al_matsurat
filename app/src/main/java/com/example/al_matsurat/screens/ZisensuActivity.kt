package com.example.al_matsurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.al_matsurat.adapter.ZisensuAdapter
import com.example.al_matsurat.data.DataSenjaSughro
import com.example.al_matsurat.model.ModelDzikir

class ZisensuActivity : AppCompatActivity() {

    private lateinit var rvDzikir: RecyclerView
    private var list: ArrayList<ModelDzikir> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zisensu)

        supportActionBar?.title = "Zikir Petang Sughro"

        rvDzikir = findViewById(R.id.rv_zisensu)
        rvDzikir.setHasFixedSize(true)
        list.addAll(DataSenjaSughro.listData)

        showRecylerZisensu()
    }

    private fun showRecylerZisensu() {
        rvDzikir.layoutManager = LinearLayoutManager(this)
        val linearZisensu = ZisensuAdapter(list)
        rvDzikir.adapter = linearZisensu
    }
}