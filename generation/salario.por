programa {
	funcao inicio() {
		cadeia nome
		inteiro idade
		cadeia sexo
		inteiro salario
		inteiro abono
		
		
		escreva("Qual o nome do funcion�rio? ")
		leia(nome)
		escreva("Qual a idade do funcion�rio? ")
		leia(idade)
		escreva("Qual o sexo do funcion�rio? (escreva M ou F)")
		leia(sexo)
		escreva("Informe o sal�rio fixo: ")
		leia(salario)
		
		se(sexo == "M" e idade >= 30){
		    abono = 100
		escreva("O sal�rio do(a) funcion�rio ", nome , "� " , salario + abono)
		}
		
		se(idade < 30 e sexo == "M"){
		    abono = 50
	    escreva("O sal�rio do(a) funcion�rio ", nome , "� " , salario + abono )
	}
		se (idade >= 30 e sexo == "F"){
		    abono = 200
		    escreva("O sal�rio do(a) funcion�rio ", nome , "� " , salario + abono )
	}
	se(idade < 30 e sexo == "F" ){
	 abono = 80
	 escreva("O sal�rio do(a) funcion�rio ", nome , " � " , salario + abono )
	}

	}
}
