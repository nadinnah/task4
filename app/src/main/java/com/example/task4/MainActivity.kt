package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zero:TextView= findViewById(R.id.zero)
        val zero2:TextView= findViewById(R.id.zero2)

        val plus2:Button= findViewById(R.id.plus2)
        plus2.setOnClickListener {addPoints(2,zero)}
        val plus2a:Button= findViewById(R.id.plus2a)
        plus2a.setOnClickListener {addPoints(2,zero2)}

        val plus3:Button= findViewById(R.id.plus3)
        plus3.setOnClickListener {addPoints(3,zero)}
        val plus3a:Button= findViewById(R.id.plus3a)
        plus3a.setOnClickListener {addPoints(3,zero2)}

        val freethrow1:Button= findViewById(R.id.freethrow1)
        freethrow1.setOnClickListener {addPoints(1,zero)}

        val freethrow2:Button= findViewById(R.id.freethrow2)
        freethrow2.setOnClickListener { addPoints(1,zero2) }

        val reset:Button= findViewById(R.id.reset)
        reset.setOnClickListener {
            zero.text= "0"
            zero2.text= "0"
        }

    }
    private fun addPoints(points: Int, scoreLabel: TextView){
        val currentScore= scoreLabel.text.toString().toInt()
        val newScore= currentScore + points
        scoreLabel.text= "$newScore"
    }
}