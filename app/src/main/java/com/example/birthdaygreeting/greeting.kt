package com.example.birthdaygreeting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting.*

class greeting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val name =intent.getStringExtra("name")
        textView.text= "happy birthday dear $name"

    }
}