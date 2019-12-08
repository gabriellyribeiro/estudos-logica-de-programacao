package lista4_1.pkg15;

public class Livro {

    protected String nome;
    protected int numeroPagina;
    protected String categoria;
    protected String autor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostraDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero de pags.: " + this.numeroPagina);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Autor: " + this.autor);
    }
}
