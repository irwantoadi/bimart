package com.irwantoadi.bimart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Batik3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batik3)

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        val btnNext: ImageButton = findViewById(R.id.btn_next)

        btnBack.setOnClickListener {
            val intent = Intent(this@Batik3Activity, Batik2Activity::class.java)
            startActivity(intent)
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this@Batik3Activity, Batik1Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}