package com.example.pengelolaanbarangbengkel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

class input_barang : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_barang)

        val actButton = findViewById<Button>(R.id.back)
        actButton.setOnClickListener{
            val intent = Intent(this, menuPage::class.java)
            startActivity(intent)
        }

    }
}