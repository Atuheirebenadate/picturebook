package com.devbenadate.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NatureActivity5 : AppCompatActivity() {
    lateinit var btnPreview:Button
    lateinit var btnBackhome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nature5)
        btnPreview=findViewById(R.id.btnPreview)
        btnBackhome=findViewById(R.id.bntBackhome)

        btnPreview.setOnClickListener {
            val intent=Intent(this,NatureActivity5::class.java)
            startActivity(intent)
        }
        btnBackhome.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}