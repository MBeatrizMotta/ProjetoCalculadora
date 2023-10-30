fun main() {
    while (true) {
        println("Calculadora")
        println("Escolha uma operação ")
        println("1 - Soma")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Calcular Raiz Quadrada")
        println("6 - Sair")

        val escolha = readln()

        when (escolha) {
            "1" -> {
                print("Digite o primeiro número: ")
                val numero1 = readln()

                print("Digite o segundo número: ")
                val numero2 = readln()

                val soma = numero1.toInt() + numero2.toInt()
                println("A soma de $numero1 e $numero2 é igual a $soma")

            }

            "2" -> {
                print("Digite o primeiro número: ")
                val numero1 = readln()

                print("Digite o segundo número: ")
                val numero2 = readln()

                val subtracao = numero1.toInt() - numero2.toInt()
                println("A subtração de $numero1 e $numero2 é igual a $subtracao")
            }

            "3" -> {
                print("Digite o primeiro número: ")
                val numero1 = readln()

                print("Digite o segundo número: ")
                val numero2 = readln()

                val multiplicacao = numero1.toInt() * numero2.toInt()
                println("A multiplicação de $numero1 e $numero2 é igual a $multiplicacao")

            }

            "4" -> {
                print("Digite o primeiro número: ")
                val numero1 = readln()

                print("Digite o segundo número: ")
                val numero2 = readln()

                try {
                    val divisao = numero1.toInt() / numero2.toInt()
                    println("A divisão de $numero1 e $numero2 é igual a $divisao")
                } catch (e: ArithmeticException) {
                    println("Erro: Divisão por zero. Não é permitido dividir por zero.")
                }
            }

            "5" -> {
                print("Digite o número para calcular a raiz quadrada: ")
                val numero = readLine()

                try {
                    val raiz = Math.sqrt(numero?.toDouble() ?: 0.0)
                    println("A raiz quadrada de $numero é igual a $raiz")
                } catch (e: NumberFormatException) {
                    println("Entrada inválida. Certifique-se de digitar um número válido.")
                }
            }

            "6" -> {
                println("Saindo da calculadora.")
                break
            }

            else -> {
                println("Escolha inválida. Por favor, escolha uma operação válida (1 a 6).")
            }
        }
    }
}
