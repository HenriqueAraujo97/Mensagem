package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
        val mensagem = editTextMensagem.text.toString()

        val intent = Intent(this, MostraMensagemActivity::class.java) // para enviar de uma atividade para a outra
        intent.putExtra("MENSAGEM", mensagem) // colocar a mensagem no intent
        startActivity(intent) // para iniciar a atividade

    }
}
