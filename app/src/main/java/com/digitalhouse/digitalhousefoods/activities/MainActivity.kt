package com.digitalhouse.digitalhousefoods.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.viewModel.MainViewModel
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val btLogin by lazy { findViewById<Button>(R.id.bt_login) }
    private val fieldLayoutEmail by lazy { findViewById<TextInputLayout>(R.id.til_email) }
    private val fieldLayoutPassword by lazy { findViewById<TextInputLayout>(R.id.til_password) }
    private val fieldInputTextEmail by lazy { findViewById<TextInputEditText>(R.id.et_email) }
    private val fieldInputTextPassword by lazy { findViewById<TextInputEditText>(R.id.et_password) }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        configureValidationOfFields()
        configureClicks()
    }

    private fun configureClicks() {
        btLogin.setOnClickListener {
            login()
        }
    }

    private fun configureValidationOfFields() {
        viewModel.fieldEmail.observe(this) { emailValid ->
            if (emailValid) {
                fieldLayoutEmail.error = null
            } else {
                fieldLayoutEmail.error = "Obrigatório"
            }

            navigateIfValid()
        }

        viewModel.fieldPassword.observe(this) { passValid ->
            if (passValid) {
                fieldLayoutPassword.error = null
            } else {
                fieldLayoutPassword.error = "Obrigatório"
            }

            navigateIfValid()
        }
    }

    private fun navigateIfValid() {
        if (viewModel.fieldEmail.value == true
            && viewModel.fieldPassword.value == true
        ) {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }

    private fun login() {
        val email = fieldInputTextEmail.text.toString()
        val password = fieldInputTextPassword.text.toString()

        viewModel.validateEntryFiels(email, password)
    }
}