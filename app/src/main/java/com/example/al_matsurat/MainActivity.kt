package com.example.al_matsurat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_zipasu.setOnClickListener {
            startActivity(Intent(this, ZipasuActivity::class.java))

            Toast.makeText(this, "Zikir Pagi Sughro", Toast.LENGTH_SHORT).show()
        }

    }
}