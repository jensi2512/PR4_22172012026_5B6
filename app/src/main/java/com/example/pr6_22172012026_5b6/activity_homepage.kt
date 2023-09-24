package com.example.pr6_22172012026_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
    }
    fun signup(view: View) {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun login(view: View) {
        var intent = Intent(this,activity_registration::class.java)
        startActivity(intent)
    }
}