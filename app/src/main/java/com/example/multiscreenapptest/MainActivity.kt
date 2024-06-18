package com.example.multiscreenapptest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val btn: Button = findViewById(R.id.button)
            val editFirstName : EditText = findViewById(R.id.edit_first_name)
            val editLastName : EditText = findViewById(R.id.edit_last_name)
        btn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("firstName", editFirstName.text.toString())
            intent.putExtra("lastName", editLastName.text.toString())
            startActivity(intent)

        }
    }
}