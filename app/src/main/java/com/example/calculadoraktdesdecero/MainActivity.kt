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

        ConstruirAcuario()

    }

    fun ConstruirAcuario (){
        var miAcuario = Acuario()
        miAcuario.Dimensiones()
        miAcuario.Volumen()

        miAcuario.alto = 80
        miAcuario.largo= 100
        miAcuario.ancho = 40

        miAcuario.Dimensiones()
        println(miAcuario.alto)
        println(miAcuario.largo)
        println(miAcuario.ancho)
        miAcuario.Volumen()

        val miAcuarioPers = Acuario(ancho = 25)
        miAcuarioPers.Volumen()
        miAcuarioPers.Dimensiones()

        var especiesEnAcuario : Acuario.especies? = null
        println("Especies en Acuario: $especiesEnAcuario")

        especiesEnAcuario = Acuario.especies.corvina

        println("Especies en Acuario: ${especiesEnAcuario}")
        println("Especies en Acuario: ${especiesEnAcuario.ordinal}")
        println("Especies en Acuario: ${especiesEnAcuario.name}")

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