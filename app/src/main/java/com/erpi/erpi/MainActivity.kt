package com.erpi.erpi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.UserDictionary
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_profile = findViewById<Button>(R.id.btn_profile)
        val btn_produk = findViewById<Button>(R.id.btn_produk)
        val btn_intent_with_parcelable = findViewById<Button>(R.id.btn_intent_with_parcelable)
        val btn_impilicit_intent = findViewById<Button>(R.id.btn_implicit_intent)
        val btn_intent_with_result = findViewById<Button>(R.id.btn_intent_with_result)

        btn_profile.setOnClickListener{
            val profile = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(profile)
            btn_produk.setOnClickListener{
                val produk = Intent(this@MainActivity, ProdukActivity::class.java)
                startActivity(produk)

                btn_produk.setOnClickListener{
                    val produk = Intent(this@MainActivity, ExplicitIntentActivity::class.java)
                    startActivity(produk)
                }

                btn_impilicit_intent.setOnClickListener{
                    val phoneNumber = "089654752268"
                    val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phoneNumber"))
                    startActivity(intent)
                }
            }
        }
    }
}