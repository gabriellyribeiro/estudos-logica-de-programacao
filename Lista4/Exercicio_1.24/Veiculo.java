
package exercicio24;

public class Veiculo {

    String nome;
    int numeroPassageiros;
    String tipoVeiculo;
    int numeroRodas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    // metodos//
    public void CalculaKM(int inicial, int kmfinal) {

        int kmtotal = kmfinal - inicial;
        System.out.println("O total de KM rodados foi de " + kmtotal);
        return;

    }

}
