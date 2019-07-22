package com.exod.alc40android

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_profile.*

class MyProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(toolbar)

        //

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
