package com.example.convidados.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodosConvidadosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment de todos os convidados"
    }
    val text: LiveData<String> = _text
}