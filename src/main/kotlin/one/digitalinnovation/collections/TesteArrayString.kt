package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    nomes.forEach {
        println(it)
    }

    nomes.sort()
    println("-----------------------------------")
    for (nome in nomes){
        println(nome)
    }

    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")

    println("-----------------------------------")
    for (nome in nomes2){
        println(nome)
    }

}