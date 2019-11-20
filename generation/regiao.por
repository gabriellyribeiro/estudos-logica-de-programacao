programa {
	funcao inicio() {
		inteiro preco
		inteiro codigo
		
		escreva("Informe um preço: ")
		leia(preco)
		escreva("Informe o código da sua região: ")
		leia(codigo)
		
		para(codigo =1; codigo <= 5; codigo++){
		    se(codigo == 1){
		        
		    escreva("Região norte. Ganhou 5% de desconto! ", preco-= preco*0.05)
		        pare
		    }
		    se(codigo == 2){
		    escreva("Região sul. Ganhou 15% de desconto! ", preco-= preco*0.15)
		    pare
		    }
		    se(codigo == 3){
		    escreva("Região sudeste. Ganhou 7% de desconto! ", preco-= preco*0.07)
		    pare
		    }
		    se(codigo == 4){
		    escreva("Região nordeste. Ganhou 12% de desconto! ", preco-= preco*0.12)
		    pare
		    }
		    se(codigo == 5){
		    escreva("Região centro-oeste. Ganhou 20% de desconto! ", preco * 0,20)
		        pare
		    }
		}
		
	}
}
