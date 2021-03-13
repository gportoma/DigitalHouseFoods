package com.digitalhouse.digitalhousefoods.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.digitalhouse.digitalhousefoods.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val btLogin by lazy { findViewById<Button>(R.id.bt_login) }
    private val fieldLayoutEmail by lazy { findViewById<TextInputLayout>(R.id.til_email) }
    private val fieldLayoutPassword by lazy { findViewById<TextInputLayout>(R.id.til_password) }
    private val fieldInputTextEmail by lazy { findViewById<TextInputEditText>(R.id.et_email) }
    private val fieldInputTextPassword by lazy { findViewById<TextInputEditText>(R.id.et_password) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        btLogin.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val email = fieldInputTextEmail.text.toString()
        val password = fieldInputTextPassword.text.toString()
        val intent = Intent(this, HomeScreen::class.java)

        when {
            email.isBlank() && password.isBlank() -> {
                fieldLayoutEmail.error = "Obrigatório"
                fieldLayoutPassword.error = "Obrigatório"
            }
            email.isBlank() -> {
                fieldLayoutEmail.error = "Obrigatório"
                fieldLayoutPassword.error = null
            }
            password.isBlank() -> {
                fieldLayoutPassword.error = "Obrigatório"
                fieldLayoutEmail.error = null
            }
            else -> {
                fieldLayoutEmail.error = null
                fieldLayoutPassword.error = null
                startActivity(intent)
            }
        }
    }
}