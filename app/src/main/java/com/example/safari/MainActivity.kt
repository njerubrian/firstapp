package com.example.safari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

// declare ur widget
 lateinit var textname: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //referencing the widget
        textname = findViewById(R.id.click)
        textname.setOnClickListener(View.OnClickListener {
            val intents = Intent(this, MainActivity2::class.java)
            startActivity(intents)
        })
    }
}