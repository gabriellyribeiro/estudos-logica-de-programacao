programa {
	funcao inicio() {
		cadeia usuario, senha
		
		escreva("Entre com seu usu�rio: ")
		leia(usuario)
		
		escreva("Digite sua senha: ")
		leia(senha)
		
		se (usuario == "generation" e senha == "brasil")
		{
		    escreva("usu�rio e senha v�lidos! ")
		}
		senao{
		    escreva("usu�rio e senha inv�lidos! ")
		}
	}
}
