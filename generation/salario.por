programa {
	funcao inicio() {
		cadeia nome
		inteiro idade
		cadeia sexo
		inteiro salario
		inteiro abono
		
		
		escreva("Qual o nome do funcionário? ")
		leia(nome)
		escreva("Qual a idade do funcionário? ")
		leia(idade)
		escreva("Qual o sexo do funcionário? (escreva M ou F)")
		leia(sexo)
		escreva("Informe o salário fixo: ")
		leia(salario)
		
		se(sexo == "M" e idade >= 30){
		    abono = 100
		escreva("O salário do(a) funcionário ", nome , "é " , salario + abono)
		}
		
		se(idade < 30 e sexo == "M"){
		    abono = 50
	    escreva("O salário do(a) funcionário ", nome , "é " , salario + abono )
	}
		se (idade >= 30 e sexo == "F"){
		    abono = 200
		    escreva("O salário do(a) funcionário ", nome , "é " , salario + abono )
	}
	se(idade < 30 e sexo == "F" ){
	 abono = 80
	 escreva("O salário do(a) funcionário ", nome , " é " , salario + abono )
	}

	}
}
