package com.akhil.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloButton = findViewById<Button>(R.id.helloButton)
        helloButton.setOnClickListener{
            Log.v("Hello_World","Button Clicked")
            Toast.makeText(this,getString(R.string.toast_msg), Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * Listener for hello Button that logs and creates a toast message.
     */
    fun helloButtonClickListener()
    {

    }
}