package com.example.convidados.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConvidadosFormViewModel :ViewModel() {

//    private val repositorio = ConvidadosRepositorio()
    private var presente = MutableLiveData<Boolean>()

    fun cadastrar(nome: String, presenca: Boolean){
        presente.value = (presenca == true && nome !="")
    }

    fun confirma_cadastro():LiveData<Boolean>{
        return presente

    }
}


