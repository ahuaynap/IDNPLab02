package com.example.idnplab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGreater = findViewById<Button>(R.id.buttonTriggerGreater)

        buttonGreater.setOnClickListener(){
            val editTextName = findViewById<EditText>(R.id.editTextTextName)
            val name = editTextName.text.toString()
            val greaterIntent = Intent(this,GreaterActivity::class.java).apply {
                putExtra("name", name)
            }
            startActivity(greaterIntent)
        }
    }
}