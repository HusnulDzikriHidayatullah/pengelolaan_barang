package com.example.pengelolaanbarangbengkel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actButton = findViewById<Button>(R.id.button)
            actButton.setOnClickListener{
                val intent = Intent(this, menuPage::class.java)
                startActivity(intent)
            }
    }
}