programa {
	funcao inicio() {
	    inteiro valores[10]
	    inteiro soma = 0
	    inteiro i = 0
		    para( i = 0; i < 10; i++){
		       escreva("Insira o valor ", i , " para somar. ")
		       leia(valores[i])
		        soma += valores[i]
		}
		escreva("A soma dos valores é:", soma)
	}
}
