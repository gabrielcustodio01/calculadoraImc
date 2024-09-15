package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val editTextAltura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener {
            val peso = editTextPeso.text
            val altura = editTextAltura.text

            println("teste de botao " + peso)
        }
    }
}