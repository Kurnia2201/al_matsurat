package com.example.al_matsurat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_zipasu.setOnClickListener {
            val intent = Intent(this, ZipasuActivity::class.java)
            startActivity(intent)
        }

        card_zisensu.setOnClickListener {
            val intent = Intent(this, ZisensuActivity::class.java)
            startActivity(intent)
        }

        card_zipaku.setOnClickListener {
            val intent = Intent(this, ZipakuActivity::class.java)
            startActivity(intent)
        }

        card_zisenku.setOnClickListener {
            val intent = Intent(this, ZisenkuActivity::class.java)
            startActivity(intent)
        }
    }
}