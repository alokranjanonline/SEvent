package com.example.sevent

import android.content.Intent

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonCSActivity: Button = findViewById(R.id.button1)
        buttonCSActivity.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}


