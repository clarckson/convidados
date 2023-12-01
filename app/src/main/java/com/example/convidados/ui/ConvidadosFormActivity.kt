package com.example.convidados.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.convidados.R
import com.example.convidados.databinding.ActivityConvidadosFormBinding
import com.example.convidados.viewmodel.ConvidadosFormViewModel

class ConvidadosFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityConvidadosFormBinding
    private lateinit var viewModel: ConvidadosFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConvidadosFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(this)
        binding.radioButtonPresente.isChecked = true

        viewModel = ViewModelProvider(this).get(ConvidadosFormViewModel::class.java)

        criaObservador()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button){
            val nome = binding.editTextNome.text.toString()
            val presente = binding.radioButtonPresente.isChecked
            val ausente = binding.radioButtonAusente.isChecked
            viewModel.cadastrar(nome, presente)
        }
    }

    private fun criaObservador() {
        viewModel.confirma_cadastro().observe(this, Observer {
            if (it){
                Toast.makeText(this, "Sucesso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Falhou", Toast.LENGTH_SHORT).show()
            }
        })
    }
}