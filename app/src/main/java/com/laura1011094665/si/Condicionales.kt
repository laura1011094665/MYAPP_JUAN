package com.laura1011094665.si

class Condicionales {
}

fun main() {
    /*
    print("Ingrese primer valor:")
    var num1: Int= readln()!!.toInt()
    print("Ingrese segundo valor:")
    var num2: Int= readln()!!.toInt()

    if (num1 < num2){
        println("$num1 es menor que $num2")
    }else if (num1 > num2){
        println("es mayor el numero $num1" )
    }else {
    println("pos pos es la misma huevada")
    }*/
/*
    println("ingres un numero del uno al 20: ")
    var numero1:Int = readln().toInt()

    if (numero1 in 1..20){
        println("perfectly tu numero $numero1 es valido")
    }else{
        println("que un numero de 1 a 20 aguevao")
    }
    */
    var result: Int=(0..60).random()
    println(result)
    when(result){
        0 -> println("no hay resultados")
        1,2,3,4,5 -> println("hay menos de 5 resutados")
        in 6..50 -> println("hay entre 5 y 50 resultados")
        else -> println("esos son bastantes resultados")
    }
}