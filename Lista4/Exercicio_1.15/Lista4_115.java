package lista4_1.pkg15;

public class Lista4_115 {

    public static void main(String[] args) {

        Livro livrinho = new Livro();
        Livro livrinhonovo = new Livro();

        System.out.println("Editora: \n");
        livrinho.setNome("Blade Runner");
        livrinho.setNumeroPagina(200);
        livrinho.setCategoria("Ficção");
        livrinho.setAutor("Felip K Dick \n");

        livrinhonovo.setNome("Neil Gaiman");
        livrinhonovo.setNumeroPagina(300);
        livrinhonovo.setCategoria("Ficção");
        livrinhonovo.setAutor("Neil Gaiman \n");

        livrinho.mostraDados();
        livrinhonovo.mostraDados();
    }
}
