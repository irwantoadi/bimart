package com.irwantoadi.bimart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)
        val back: ImageButton = findViewById(R.id.back)
        val btnMuseum: ImageButton = findViewById(R.id.btn_museum)

        btnMuseum.setOnClickListener {
            val intent = Intent(this@Menu4Activity, MuseumActivity::class.java)
            startActivity(intent)
        }

        back.setOnClickListener {
            finish()
        }
    }
}