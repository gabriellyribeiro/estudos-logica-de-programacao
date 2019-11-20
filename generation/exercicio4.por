programa {
	funcao inicio() {
		real notaUm, notaDois, media
		
		escreva("Digite sua primeira nota: ")
		leia(notaUm)
		
		escreva("Digite sua segunda nota: ")
		leia(notaDois)
		
		media = (notaUm + notaDois) / 2
		
		se media >= 7{
		    escreva("aprovado")
		}
	}
}
