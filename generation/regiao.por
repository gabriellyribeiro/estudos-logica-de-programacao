programa {
	funcao inicio() {
		inteiro preco
		inteiro codigo
		
		escreva("Informe um pre�o: ")
		leia(preco)
		escreva("Informe o c�digo da sua regi�o: ")
		leia(codigo)
		
		para(codigo =1; codigo <= 5; codigo++){
		    se(codigo == 1){
		        
		    escreva("Regi�o norte. Ganhou 5% de desconto! ", preco-= preco*0.05)
		        pare
		    }
		    se(codigo == 2){
		    escreva("Regi�o sul. Ganhou 15% de desconto! ", preco-= preco*0.15)
		    pare
		    }
		    se(codigo == 3){
		    escreva("Regi�o sudeste. Ganhou 7% de desconto! ", preco-= preco*0.07)
		    pare
		    }
		    se(codigo == 4){
		    escreva("Regi�o nordeste. Ganhou 12% de desconto! ", preco-= preco*0.12)
		    pare
		    }
		    se(codigo == 5){
		    escreva("Regi�o centro-oeste. Ganhou 20% de desconto! ", preco * 0,20)
		        pare
		    }
		}
		
	}
}
