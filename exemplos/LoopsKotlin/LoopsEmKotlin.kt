fun main() {
    println("Exemplo de for basico")
    for (i in 1..5) print("$i ")//(.. é o mesmo que until)
    println()
    println("Exemplo de for com step 2")
    for (i in 1..5 step 2) print("$i ")//(step muda o valor que aumenta a cada repetição)
    println()
    println("Exemplo de for com downTo")
    for (i in 5 downTo 1) print("$i ")//(downTo faz subtrair ao inves de somar)
    println()
    println("Exemplo de While basico")
    var x = 3
    while (x > 0) {print(x--)}//(executa enquanto a verificação for verdadeira)
    println()
    println("Exemplo de do-While")
    x = 0
    do {
    println(x)//(executa uma vez mesmo que a afirmação seja falsa)
	} while (x > 0)
    print("Fim! :)")
}