package com.example.project

import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val textView1: TextView = findViewById(R.id.textView1)
        textView1.text = "FIT 4-6"
        textView1.textSize = 22f
        textView1.setTextColor(Color.parseColor("#0000FF"))
        textView1.setBackgroundColor(Color.parseColor("#00FF00"))

        val buttonChangeText: Button = findViewById(R.id.buttonChangeText)
        buttonChangeText.setOnClickListener{
            textView.text = "Змінює текст"
            textView1.text = "У текстових полях"
        }
    }
}