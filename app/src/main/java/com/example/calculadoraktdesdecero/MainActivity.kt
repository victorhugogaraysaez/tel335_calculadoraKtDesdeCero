package com.example.calculadoraktdesdecero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.view.View
import android.util.Log

class MainActivity : AppCompatActivity() {
    var cifra_01: EditText? = null
    var cifra_02: EditText? = null
    var resultado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cifra_01 = findViewById(R.id.cifra_01)
        cifra_02 = findViewById(R.id.cifra_02)
        resultado = findViewById(R.id.resultado)
    }

    fun sumar (view: View?) {
        val resultadoNumero=
            cifra_01!!.text.toString().toInt() + cifra_02!!.text.toString().toInt()
            resultado!!.text = resultadoNumero.toString()
            Log.d("operacionSuma", "Boton suma apretado")
    }

    fun restar (view: View?) {
        val resultadoNumero=
            cifra_01!!.text.toString().toInt() - cifra_02!!.text.toString().toInt()
        resultado!!.text = resultadoNumero.toString()
        Log.d("operacionResta", "Boton resta apretado")
    }

    fun multiplicar (view: View?) {
        val resultadoNumero=
            cifra_01!!.text.toString().toInt() * cifra_02!!.text.toString().toInt()
        resultado!!.text = resultadoNumero.toString()
        Log.d("operacionMultiplicacion", "Boton multiplicacion apretado")
    }

    fun dividir (view: View?) {
        val resultadoNumero=
            cifra_01!!.text.toString().toInt() / cifra_02!!.text.toString().toInt()
        resultado!!.text = resultadoNumero.toString()
        Log.d("operacionDivision", "Boton division apretado")
    }
}