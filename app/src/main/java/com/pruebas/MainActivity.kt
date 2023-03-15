package com.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesyConstantes()
        val btn = findViewById<Button>(R.id.button3)
        btn.setOnClickListener {
            val lanzarInicioSesion=Intent(this, InicioSesion::class.java)
            startActivity(lanzarInicioSesion)
        }
    }

    private fun variablesyConstantes(){

    }
}