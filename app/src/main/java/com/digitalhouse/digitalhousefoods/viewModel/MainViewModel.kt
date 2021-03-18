package com.digitalhouse.digitalhousefoods.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val fieldEmail: MutableLiveData<Boolean> by lazy { MutableLiveData<Boolean>() }
    val fieldPassword: MutableLiveData<Boolean> by lazy { MutableLiveData<Boolean>() }

    //lógica de validação de parametros de entrada
    fun validateEntryFiels(email: String, password: String) {
        when {
            email.isBlank() && password.isBlank() -> {
                fieldEmail.postValue(false)
                fieldPassword.postValue(false)
            }
            email.isBlank() -> {
                fieldEmail.postValue(false)
                fieldPassword.postValue(true)
            }
            password.isBlank() -> {
                fieldEmail.postValue(true)
                fieldPassword.postValue(false)
            }
            else -> {
                fieldEmail.postValue(true)
                fieldPassword.postValue(true)
            }
        }

        //chamada de api

        //resultado usuario

        //shared para salvar o usuario
    }

    //logica de login
}