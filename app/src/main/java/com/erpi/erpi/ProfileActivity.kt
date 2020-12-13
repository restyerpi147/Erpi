package com.erpi.erpi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_kembali = findViewById<Button>(R.id.btn_kembali)


        btn_kembali.setOnClickListener{
            val kembali= Intent(this@ProfileActivity, MainActivity::class.java)
            startActivity(kembali)
        }
    }
}