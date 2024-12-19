package com.example.tpcolore

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val buttonRouge = findViewById<Button>(R.id.buttonRouge)
        val buttonBleue = findViewById<Button>(R.id.buttonBleue)
        val buttonJaune = findViewById<Button>(R.id.buttonJaune)

        buttonRouge.setOnClickListener {
            imageView.setImageResource(R.drawable.rouge)
        }

        buttonBleue.setOnClickListener {
            imageView.setImageResource(R.drawable.bleue)
        }

        buttonJaune.setOnClickListener {
            imageView.setImageResource(R.drawable.jaune)
        }
    }
}