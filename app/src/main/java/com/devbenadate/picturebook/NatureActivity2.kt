package com.devbenadate.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NatureActivity2 : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nature3)
        btnBack3=findViewById(R.id.btnBack3)
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent=Intent(this,NatureActivity2::class.java)
            startActivity(Intent())
        }
        btnBack3.setOnClickListener {
            val intent=Intent(this,NatureActivity3::class.java)
            startActivity(Intent())
        }

    }
}