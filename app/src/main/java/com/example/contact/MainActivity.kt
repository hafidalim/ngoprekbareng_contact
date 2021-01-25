package com.example.contact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var txtName : TextView? = null
    private var btnDetail : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txtName)
        btnDetail = findViewById(R.id.btn_detail)

        btnDetail?.setOnClickListener {
            val detailIntent = Intent(applicationContext,DetailActivity::class.java)
            startActivity(detailIntent)
        }
    }
}