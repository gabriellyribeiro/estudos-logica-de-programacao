programa {
	funcao inicio() {
		real numeroUm, numeroDois, soma,subtracao, multiplicacao, divisao
		
		escreva("Digite o primeiro número: ")
		leia(numeroUm)
		
		escreva("Digite o segundo número: ")
		leia(numeroDois)
		
		soma = numeroUm + numeroDois
		subtracao = numeroUm - numeroDois
		multiplicacao = numeroUm * numeroDois
		divisao = numeroUm / numeroDois
		
		
		escreva("\n A soma dos números é igual a: " , soma)
		escreva("\n A subtração dos números é igual a: " , subtracao)
		escreva("\n A multiplicação dos números é igual a: " , multiplicacao )
		escreva("\n A divisão dos números é igual a: " ,  divisao, " \n")
	}
}
