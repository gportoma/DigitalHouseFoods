package com.digitalhouse.digitalhousefoods.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.digitalhouse.digitalhousefoods.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        val btLogin by lazy { findViewById<Button>(R.id.bt_login) }

        btLogin.setOnClickListener {
            val intent = Intent(this,RestaurantScreen::class.java)
            startActivity(intent)
        }
    }
}