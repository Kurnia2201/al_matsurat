package com.example.al_matsurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.al_matsurat.adapter.ZipakuAdapter
import com.example.al_matsurat.data.DataPagiKubro
import com.example.al_matsurat.data.DataPagiSughro
import com.example.al_matsurat.model.ModelDzikir

class ZipakuActivity : AppCompatActivity() {

    private lateinit var rvDzikir: RecyclerView
    private var list: ArrayList<ModelDzikir> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zipaku)

        supportActionBar?.title = "Zikir Pagi Kubro"

        rvDzikir = findViewById(R.id.rv_zipaku)
        rvDzikir.setHasFixedSize(true)
        list.addAll(DataPagiKubro.listData)

        showRecylerZipasu()
    }

    private fun showRecylerZipasu() {
        rvDzikir.layoutManager = LinearLayoutManager(this)
        val linearZipaku = ZipakuAdapter(list)
        rvDzikir.adapter = linearZipaku
    }
}