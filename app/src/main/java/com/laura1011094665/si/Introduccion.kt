package com.laura1011094665.si

class Introduccion {
}

fun main() {
    var name: String="Juan,Laura,Mafe"
    var number1: Long = 10000000
    var number2: Short = 10000
    var coma: Double = 270.15
    var pi: Float = 3.1416F
    var color: Char = 'a'
    var byte: Byte = 32
    var AEIOU: Boolean = true

    println(name)
    println(number1)
    println(number2)
    println(coma)
    println(pi)
    println(color)
    println(byte)
    println(AEIOU)

    println("$name.length is ${name.length}")

    print("Ingrese primer valor:")
    val num1: Int = readln().toInt()

    print("Ingrese segundo valor:")
    val num2: Int = readln().toInt()

    val suma: Int = num1.plus(num2)

    println("La suma: $num1 + $num2 = $suma")
}