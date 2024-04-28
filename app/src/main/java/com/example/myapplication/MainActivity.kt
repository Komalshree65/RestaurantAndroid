package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activitymain)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            callActivity()
        }
        }

    private fun callActivity() {
        val editText = findViewById<EditText>(R.id.text1)
        val message = editText.text.toString()

        val intent = Intent(this,MainActivity3::class.java).also {
            it.putExtra("message" ,message)
            startActivity(it)
        }
    }

}