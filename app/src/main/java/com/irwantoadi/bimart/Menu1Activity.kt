package com.irwantoadi.bimart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)
        val back: ImageButton = findViewById(R.id.back)

        back.setOnClickListener {
            finish()
        }
    }
}