package com.irwantoadi.bimart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Batik2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batik2)

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        val btnNext: ImageButton = findViewById(R.id.btn_next)

        btnBack.setOnClickListener {
            val intent = Intent(this@Batik2Activity, Batik1Activity::class.java)
            startActivity(intent)
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this@Batik2Activity, Batik3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}