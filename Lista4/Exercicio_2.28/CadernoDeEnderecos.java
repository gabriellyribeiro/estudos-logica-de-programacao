package lista4_2.pkg28;

public class CadernoDeEnderecos {
    private String nome;
    private int telefone;
    private String email;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //Alteração de telefone
    public void mudaTel(int recebeTelefone){
        telefone = recebeTelefone;
    }
    
    //Alteração de endereço
    public void mudaEnd (String recebeEndereco){
        endereco = recebeEndereco;
    }
    
    public void mudaEmail(String recebeEmail){
        email = recebeEmail;
    }
}
