programa {
	funcao inicio() {
		real numeroUm, numeroDois, soma,subtracao, multiplicacao, divisao
		
		escreva("Digite o primeiro n�mero: ")
		leia(numeroUm)
		
		escreva("Digite o segundo n�mero: ")
		leia(numeroDois)
		
		soma = numeroUm + numeroDois
		subtracao = numeroUm - numeroDois
		multiplicacao = numeroUm * numeroDois
		divisao = numeroUm / numeroDois
		
		
		escreva("\n A soma dos n�meros � igual a: " , soma)
		escreva("\n A subtra��o dos n�meros � igual a: " , subtracao)
		escreva("\n A multiplica��o dos n�meros � igual a: " , multiplicacao )
		escreva("\n A divis�o dos n�meros � igual a: " ,  divisao, " \n")
	}
}
