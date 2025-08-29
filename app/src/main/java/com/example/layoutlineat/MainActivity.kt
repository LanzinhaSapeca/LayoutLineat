package com.example.layoutlineat

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var Login = findViewById<EditText>(R.id.editTextLogin).text
        var Senha = findViewById<EditText>(R.id.editTextSenha).text
        var btnLogin = findViewById<Button>(R.id.buttonLogin)
        var btnCadastro = findViewById<Button>(R.id.buttonCadastro)

        btnLogin.setOnClickListener {
            if (Login.equals("email@gmail.com") && Senha.equals("123")) {
                var Intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Usuário ou senha incorretos!",Toast.LENGTH_LONG).show()
            }
        }
    }
}