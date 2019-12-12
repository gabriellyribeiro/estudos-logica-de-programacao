package lista4_2.pkg28;

public class Lista4_228 {

    public static void main(String[] args) {
        CadernoDeEnderecos pessoa = new CadernoDeEnderecos();

        pessoa.setNome("Leonardo");
        pessoa.setTelefone(12345678);
        pessoa.setEndereco("rua Tiradentes");
        pessoa.setEmail("leorusso@gmail.com");

        // imprimir dados
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getTelefone());
        System.out.println(pessoa.getEndereco());
        System.out.println(pessoa.getEmail());
        System.out.println("");// pula linha
        // Altera dados

        pessoa.mudaTel(7539514);
        pessoa.mudaEnd("nova rua");
        pessoa.mudaEmail("novo@email.com");

        // imprimir dados
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getTelefone());
        System.out.println(pessoa.getEndereco());
        System.out.println(pessoa.getEmail());

    }
}
