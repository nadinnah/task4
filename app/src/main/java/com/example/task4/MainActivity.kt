package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var button:Button
    private lateinit var button1:Button
    private lateinit var button2:Button
    private lateinit var button3:Button
    private lateinit var button4:Button
    private lateinit var button5:Button
    private lateinit var button6:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
    }

    private fun initializeView() {
        button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

        }
        button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {

        }
        button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {

        }
        button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {

        }
        button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {

        }
        button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {

        }
        button = findViewById<Button>(R.id.button6)
        button.setOnClickListener {

        }

    }
}