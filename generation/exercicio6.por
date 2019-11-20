programa {
	funcao inicio() {
		real n1, n2, n3, n4
	
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terceiro número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)
		
		se(n1 > n2 e n1 > n3 e n1 > n4){
		    escreva(n1)
		}
		se(n2 > n1 e n2 > n3 e n2 > n4){
		    escreva(n2)
		    
		}
		se(n3 > n1 e n3 > n2 e n3 > n4){
		    escreva(n3)
		    
		}
		se(n4 > n1 e n4 > n2 e n4 > n3){
		    escreva(n4)
		    
		}
	}
}
