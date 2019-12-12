
package exercicio24;

public class Exercicio24 {

    public static void main(String[] args) {

        Veiculo dadosVeiculo = new Veiculo();

        dadosVeiculo.setNome("Palio");
        dadosVeiculo.setNumeroPassageiros(4);
        dadosVeiculo.setNumeroRodas(4);
        dadosVeiculo.setTipoVeiculo("Terrestre");

        System.out.println("O carro é " + dadosVeiculo.getNome());
        System.out.println("O numero de passageiros " + dadosVeiculo.getNumeroPassageiros());
        System.out.println("O numero de rodas " + dadosVeiculo.getNumeroRodas());
        System.out.println("O tipo do veículo é: " + dadosVeiculo.getTipoVeiculo());

        // metodos //
        dadosVeiculo.CalculaKM(100, 230);

    }

}
