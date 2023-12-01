package com.example.convidados.repositorio

import android.content.Context

class ConvidadosRepositorio private constructor(context: Context) {

   private val convidadosDatabase = ConvidadosDatabase(context)

    // o private constructor é para ninguém de fora instanciar
    //Singleton - gerenciamento de instancias e banco de dados
    companion object {
        private lateinit var repositorio: ConvidadosRepositorio

        fun getInstance(context: Context): ConvidadosRepositorio {
            if (!::repositorio.isInitialized) {
                repositorio = ConvidadosRepositorio(context)
            }
            return repositorio
        }
    }

    fun save(){


    }

    fun update() {


    }
}