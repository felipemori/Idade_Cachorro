package com.tads.appidadecachorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Bundle? = intent.extras


        val valor_idade = dados?.getString("campo_Idade")


        idadeCachorro.text = valor_idade
    }
}
