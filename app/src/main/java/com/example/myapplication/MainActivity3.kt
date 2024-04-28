package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activitymain3)
       val message = intent.getStringExtra("message" )
        val textview = findViewById<TextView>(R.id.text3).apply {
            text = "Hey "  +  " $message"
        }
        val imgbutton = findViewById<ImageButton>(R.id.imageButton)
        imgbutton.setOnClickListener{
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)

        }
        val img1button = findViewById<ImageButton>(R.id.imageButton3)
        img1button.setOnClickListener{
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        val img2button = findViewById<ImageButton>(R.id.imageButton2)
        img2button.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        val img3button = findViewById<ImageButton>(R.id.imageButton4)
        img3button.setOnClickListener{
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }













































    }
}