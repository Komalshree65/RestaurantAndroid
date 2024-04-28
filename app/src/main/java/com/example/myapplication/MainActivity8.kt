package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity8 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activitymain8)
        val message = intent.getStringExtra("meal" )
        val message1 = intent.getStringExtra("seats" )
        val message2 = intent.getStringExtra("date" )
        val message3 = intent.getStringExtra("time" )
        val textview = findViewById<TextView>(R.id.texting1).apply {
            text = "Your Meal "  +  " $message"


        }
        val textview1 = findViewById<TextView>(R.id.texting2).apply {

            text = "Your Seat"  +  " $message1"


        }
        val textview2 = findViewById<TextView>(R.id.texting3).apply {

            text = "Date: "  +   " $message2"


        }
        val textview3 = findViewById<TextView>(R.id.texting4).apply {

            text = "Timings: "  +  " $message3"


        }
        val but = findViewById<Button>(R.id.button3)
        but.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}