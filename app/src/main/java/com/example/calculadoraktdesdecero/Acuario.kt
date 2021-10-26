package com.example.calculadoraktdesdecero

class Acuario(var largo: Int = 50, var ancho : Int = 70 , var alto : Int = 90 ) {

    init{
        println("Acuario Inicializando")
    }

    enum class especies{
        angel, beta, cebra, guppy, payaso, reineta, congrio, corvina, merluza
    }

    fun Volumen(){
        /* 1000 cc. = 1 litro */
        println ("Volumen = ${largo * ancho * alto /1000}  litros.")
    }

    fun Dimensiones () {
        println ("Largo: $largo cm. Ancho: $ancho cm. Alto: $alto cm.")
    }
}