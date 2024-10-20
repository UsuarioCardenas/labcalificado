package com.cardenas.diego.usolayoutsv4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio01 : AppCompatActivity() {
    private lateinit var squareView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio01)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        squareView = findViewById(R.id.squareView)
        val buttonShow = findViewById<Button>(R.id.buttonShow)
        val buttonHide = findViewById<Button>(R.id.buttonHide)
        buttonShow.setOnClickListener {
            squareView.visibility = View.VISIBLE
        }
        buttonHide.setOnClickListener {
            squareView.visibility = View.GONE
        }
    }
}