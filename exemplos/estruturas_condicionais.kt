fun main() {

    // Pergunta a idade ao usuário
    print("Digite sua idade: ")

    // Le a idade digitada
    val idade = readLine()!!.toInt()

    // Verifica se o usuario e maior de idade ou nao
    if (idade > 18) {
        println("Voce e maior de idade.")
    } else if (idade == 18){
        println("Voce esta quase se tornando adulto.")
    } else {
        println("Voce e menor de idade.")
    }

}
