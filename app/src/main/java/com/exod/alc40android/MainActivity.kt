package com.exod.alc40android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, AboutAlc::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }
    }
}
