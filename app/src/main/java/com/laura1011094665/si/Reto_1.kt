package com.laura1011094665.si

class Reto_1 {
}

fun main() {
    println("bienvenido, juega con nosotros en juegos craps")

    var dado1:Int= (1..6).random()
    var dado2:Int=(1..6).random()

    println("el resultado del dado1 es: $dado1")
    println("el resultado del dado2 es: $dado2")

    var result=dado1+dado2
    println("el resultado de la suma de los dos dados es: $result")

    when(result){
        2-> println("felicidaedes ganaste bebe")
        3->println("felicidaedes ganaste bebe")
        11->println("felicidaedes ganaste bebe")
        12->println("felicidaedes ganaste bebe")
        7->println("felicidaedes ganaste bebe")
        else-> println("perdiste bb:(")
    }
}