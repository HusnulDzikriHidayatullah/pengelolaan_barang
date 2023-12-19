package com.example.pengelolaanbarangbengkel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actButton = findViewById<Button>(R.id.back)
        actButton.setOnClickListener{
            val intent = Intent(this, kategori::class.java)
            startActivity(intent)
        }

        val Button = findViewById<Button>(R.id.home)
        Button.setOnClickListener{
            val intent = Intent(this, menuPage::class.java)
            startActivity(intent)
        }
    }
}