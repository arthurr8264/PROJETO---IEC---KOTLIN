fun saudacao() {
    println("Olá! Bem-vindo ao projeto de funções básicas em Kotlin.")
}

// Função com parâmetros
fun soma(a: Int, b: Int): Int {
    return a + b
}

// Função com retorno String
fun maiorIdade(idade: Int): String {
    return if (idade >= 18) {
        "É maior de idade"
    } else {
        "É menor de idade"
    }
}

// Função sem retorno (Unit)
fun mostrarMensagem(mensagem: String) {
    println("Mensagem: $mensagem")
}

fun main() {

    saudacao()

    println("\n--- Soma ---")
    val resultado = soma(10, 5)
    println("Resultado da soma: $resultado")

    println("\n--- Idade ---")
    println(maiorIdade(20))
    println(maiorIdade(15))

    println("\n--- Mensagem ---")
    mostrarMensagem("Kotlin é uma linguagem simples e poderosa!")

}