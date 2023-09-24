package com.example.pr6_22172012026_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun homepage(view: View) {
        var intent = Intent(this,activity_homepage::class.java)
        startActivity(intent)
    }
}