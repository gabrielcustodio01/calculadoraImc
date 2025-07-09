package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val textView_result = findViewById<TextView>(R.id.textView_result)
        textView_result.text = String.format("%.2f", result)

        /*
        MENOR QUE 18,5          MAGREZA
        ENTRE 18,5 E 24,9       NORMAL
        ENTRE 25,0 E 29,9       SOBREPESO I
        ENTRE 30,0 E 39,9       OBESIDADE II
        MAIOR QUE 40,0          OBESIDADE GRAVE
        */

        var classificacao: String = if(result <= 18.5f){
            "MAGREZA"
        } else if(result > 18.5f && result <= 24.9f){
            "NORMAL"
        } else if(result > 25f && result <= 29.9f){
            "SOBREPESO"
        } else if(result > 30f && result <= 39.9f){
            "OBESIDADE"
        } else {
            "OBESIDADE GRAVE"
        }

        val textView_classificacao = findViewById<TextView>(R.id.textView_classificacao)
        textView_classificacao.text = classificacao

        println("Resultado em ResultActivity " + result)

        //testando commit
    }
}