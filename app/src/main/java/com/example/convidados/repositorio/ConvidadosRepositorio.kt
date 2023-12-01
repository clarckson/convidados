package com.example.convidados.repositorio

class ConvidadosRepositorio private constructor() {

    //Singleton

    companion object {
        private lateinit var repositorio: ConvidadosRepositorio

        fun getInstance(): ConvidadosRepositorio {
            if (!Companion::repositorio.isInitialized) {
                repositorio = ConvidadosRepositorio()
            }
            return repositorio
        }
    }
}