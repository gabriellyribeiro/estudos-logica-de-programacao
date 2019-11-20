programa {
	funcao inicio() {
		cadeia usuario, senha
		
		escreva("Entre com seu usuário: ")
		leia(usuario)
		
		escreva("Digite sua senha: ")
		leia(senha)
		
		se (usuario == "generation" e senha == "brasil")
		{
		    escreva("usuário e senha válidos! ")
		}
		senao{
		    escreva("usuário e senha inválidos! ")
		}
	}
}
