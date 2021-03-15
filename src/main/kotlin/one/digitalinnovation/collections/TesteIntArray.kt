package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values){
        println("impressão usando o for: " + valor)
    }

    println("-----------------------------------")
    values.forEach {
        println("impressão usando o forEach: " +it)
    }

    println("-----------------------------------")
    values.forEach { valor ->
        println("impressão usando o forEach sem a variável it: " +valor)
    }

    println("-----------------------------------")
    for (index in values.indices){
        println("Imprime o indice do vetor: " + values[index])
    }

    println("-----------------------------------")
    values.sort()
    for (valor in values){
        println("Imprime ordenadamente: " + valor)
    }
}