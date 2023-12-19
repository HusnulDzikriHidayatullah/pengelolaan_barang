package com.example.pengelolaanbarangbengkel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import kotlin.system.exitProcess

class menuPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)

        val ImageButton = findViewById<ImageButton>(R.id.tambah)
        ImageButton.setOnClickListener{
            val intent = Intent(this, input_barang::class.java)
            startActivity(intent)
        }

        val ImageView = findViewById<ImageView>(R.id.listbarang)
        ImageView.setOnClickListener{
            val intent = Intent(this, kategori::class.java)
            startActivity(intent)
        }

        val LogoutButton = findViewById<Button>(R.id.logoutbutton)
        LogoutButton.setOnClickListener{
            val intent = Intent(this, exitProcess(0)::class.java)
            startActivity(intent)
        }

    }

}