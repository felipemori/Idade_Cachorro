package com.tads.appidadecachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            var var_idade = text_idade.text


            val calculo = Integer.parseInt( var_idade.toString()) * 7


            intent.putExtra("campo_Idade", calculo.toString())
            startActivity(intent)
        }


    }
}
