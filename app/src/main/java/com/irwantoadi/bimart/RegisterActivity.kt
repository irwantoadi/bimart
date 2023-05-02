package com.irwantoadi.bimart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btn_submit: Button = findViewById(R.id.btn_submit)

        btn_submit.setOnClickListener {
            finish()
        }
    }
}