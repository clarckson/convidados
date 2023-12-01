package com.example.convidados.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PresentesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment dos presentes"
    }
    val text: LiveData<String> = _text
}