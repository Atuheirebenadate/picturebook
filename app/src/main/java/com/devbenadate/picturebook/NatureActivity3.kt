package com.devbenadate.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NatureActivity3 : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nature2)
        btnBack2=findViewById(R.id.btnBack2)
        btnNext2=findViewById(R.id.btnNext2)

        btnNext2.setOnClickListener {
            val intent=Intent(this,NatureActivity4::class.java)
            startActivity(intent)

        }
        btnBack2.setOnClickListener {
            val intent=Intent(this,NatureActivity3::class.java)
            startActivity(intent)
        }

    }
}