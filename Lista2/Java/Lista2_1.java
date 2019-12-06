package lista2_1;

import java.util.Scanner;

public class Lista2_1 {
    // Construa um programa que apresente o peso total que será carregado por um
    // caminhão. Sabe-se que esse caminhão carrega 25 caixas, com pesos diferentes.
    // Será entrada do programa o peso (P) de cada uma das caixas.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pesoTotal = 0;
        for (int i = 1; i <= 25; i++) {
            System.out.println("Digite o peso da caixa " + i);
            int p = s.nextInt();
            pesoTotal = pesoTotal + p;
        }
        System.out.println("O peso total a ser carregado pelo caminhão será " + pesoTotal + "Kg.");
    }
}
