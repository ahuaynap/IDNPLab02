package com.example.idnplab02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreaterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greater)

        val name = intent.getStringExtra("name")

        val textViewGreating = findViewById<TextView>(R.id.textViewGreater).apply {
            text = "Welcome " + name
        }

    }
}