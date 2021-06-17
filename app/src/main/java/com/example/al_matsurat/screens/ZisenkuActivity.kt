package com.example.al_matsurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.al_matsurat.adapter.ZisenkuAdapter
import com.example.al_matsurat.adapter.ZisensuAdapter
import com.example.al_matsurat.data.DataSenjaKubro
import com.example.al_matsurat.model.ModelDzikir

class ZisenkuActivity : AppCompatActivity() {

    private lateinit var rvDzikir: RecyclerView
    private var list: ArrayList<ModelDzikir> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zisenku)

        supportActionBar?.title = "Zikir Petang Kubro"

        rvDzikir = findViewById(R.id.rv_zisenku)
        rvDzikir.setHasFixedSize(true)
        list.addAll(DataSenjaKubro.listData)

        showRecylerZisenku()
    }

    private fun showRecylerZisenku() {
        rvDzikir.layoutManager = LinearLayoutManager(this)
        val linearZisenku = ZisenkuAdapter(list)
        rvDzikir.adapter = linearZisenku
    }
}