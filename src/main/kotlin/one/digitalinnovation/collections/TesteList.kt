package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("-----------------------------------")
    println(funcionarios.find {it.nome=="Maria"})

    //Ordena os funcionarios pelo salário
    println("-----------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    //Agrupa os funcionarios pelo tipo de contratação
    println("-----------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}