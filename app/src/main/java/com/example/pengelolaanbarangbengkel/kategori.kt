package com.example.pengelolaanbarangbengkel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class kategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        val actButton = findViewById<Button>(R.id.back)
        actButton.setOnClickListener{
            val intent = Intent(this, menuPage::class.java)
            startActivity(intent)
        }

        val ImageButton = findViewById<ImageButton>(R.id.kategori1)
        ImageButton.setOnClickListener{
            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        }

        val ImageView = findViewById<ImageView>(R.id.kategori2)
        ImageView.setOnClickListener{
            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        }
    }
}