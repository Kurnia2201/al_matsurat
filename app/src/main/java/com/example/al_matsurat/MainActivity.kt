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

        card_zisensu.setOnClickListener {
            startActivity(Intent(this, ZisensuActivity::class.java))

            Toast.makeText(this, "Zikir Petang Sughro", Toast.LENGTH_SHORT).show()
        }

        card_zipaku.setOnClickListener {
            startActivity(Intent(this, ZipakuActivity::class.java))

            Toast.makeText(this, "Zikir Pagi Kubro", Toast.LENGTH_SHORT).show()
        }

        card_zisenku.setOnClickListener {
            startActivity(Intent(this, ZisenkuActivity::class.java))

            Toast.makeText(this, "Zikir Petang Kubro", Toast.LENGTH_SHORT).show()
        }

    }
}