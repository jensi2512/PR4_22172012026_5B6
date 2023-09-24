package com.example.pr6_22172012026_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class activity_registration : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }
    fun homepage(view: View) {
        var intent = Intent(this,activity_homepage::class.java)
        startActivity(intent)
    }
}
