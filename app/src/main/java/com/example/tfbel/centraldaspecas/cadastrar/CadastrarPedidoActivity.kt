package com.example.tfbel.centraldaspecas.cadastrar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tfbel.centraldaspecas.R

class CadastrarPedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_pedido)
        supportActionBar?.hide()
    }
}