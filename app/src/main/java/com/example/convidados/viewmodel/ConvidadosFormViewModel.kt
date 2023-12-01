package com.example.convidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.convidados.repositorio.ConvidadosRepositorio

class ConvidadosFormViewModel(application: Application) :AndroidViewModel(application ) {

    private val repositorio = ConvidadosRepositorio.getInstance(application)


    private var presente = MutableLiveData<Boolean>()

    fun cadastrar(nome: String, presenca: Boolean){
        presente.value = (presenca == true && nome !="")
    }

    fun confirma_cadastro():LiveData<Boolean>{
        return presente

    }
}


