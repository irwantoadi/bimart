package com.irwantoadi.bimart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Batik1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batik1)

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        val btnNext: ImageButton = findViewById(R.id.btn_next)

        btnBack.setOnClickListener {
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this@Batik1Activity, Batik2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}