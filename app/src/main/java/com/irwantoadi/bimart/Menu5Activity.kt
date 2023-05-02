package com.irwantoadi.bimart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Menu5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu5)
        val back: ImageButton = findViewById(R.id.back)

        val btn_menu_1: ImageButton = findViewById(R.id.btn_menu_1)
        val btn_menu_2: ImageButton = findViewById(R.id.btn_menu_2)
        val btn_menu_3: ImageButton = findViewById(R.id.btn_menu_3)

        btn_menu_1.setOnClickListener {
            val intent = Intent(this@Menu5Activity, Batik1Activity::class.java)
            startActivity(intent)
        }
        btn_menu_2.setOnClickListener {
            val intent = Intent(this@Menu5Activity, Batik2Activity::class.java)
            startActivity(intent)
        }
        btn_menu_3.setOnClickListener {
            val intent = Intent(this@Menu5Activity, Batik3Activity::class.java)
            startActivity(intent)
        }

        back.setOnClickListener {
            finish()
        }
    }
}