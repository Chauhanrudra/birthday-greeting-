package com.example.birthdaygreeting

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private fun Intent.putExtra(name: String) {

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clickButton(view: View) {
        val name = nameInput.editableText.toString()

//
     Toast.makeText(this, "happy birthday $name",Toast.LENGTH_LONG).show()
        val intent = Intent(this , greeting::class.java)
        intent.putExtra("name",name)

        startActivity(intent)
    }
}