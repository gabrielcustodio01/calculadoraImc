package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val editTextAltura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener {
            val pesoString: String = editTextPeso.text.toString()
            val alturaString: String = editTextAltura.text.toString()

            if (pesoString != "" && alturaString != "") {
                val peso: Float = pesoString.toFloat()
                val altura: Float = alturaString.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println("teste de botao " + resultado)
            } else {
                Snackbar.make(
                    editTextPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()
                //mostrar mensagem para o usuario
            }
        }
    }
}