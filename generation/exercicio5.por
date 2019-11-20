programa {
	funcao inicio() {
		real mes
		
		escreva("Digite o número referente ao mês do seu aniversário: ")
		leia(mes)
		
		se (mes == 1){
		    escreva("janeiro")
		}
			se (mes == 2){
		    escreva("fevereiro")
		}
			se (mes == 3){
		    escreva("março")
		}
			se (mes == 4){
		    escreva("abril")
		}
			se (mes == 5){
		    escreva("maio")
		}
			se (mes == 6){
		    escreva("junho")
		}
			se (mes == 7){
		    escreva("julho")
		}
		se (mes == 8){
		    escreva("agosto")
		}
		se (mes == 9){
		    escreva("setembro")
		}
		se (mes == 10){
		    escreva("outubro")
		}
		se (mes == 11){
		    escreva("novembro")
		}
		se (mes == 12){
		    escreva("dezembro")
		}
		senao{
		    se(mes > 12){
		    escreva("Ops, só temos 12 meses no ano")
		    }
		}
	}
}
