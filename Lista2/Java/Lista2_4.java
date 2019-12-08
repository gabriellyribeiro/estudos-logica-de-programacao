package lista2_4;

import java.util.Scanner;

public class Lista2_4 {
    // Construa um programa que leia o número de horas trabalhadas diárias (NH) de
    // um funcionário por um período de 30 dias (ele trabalhou todos os 30 dias) e
    // apresente o salário bruto recebido por ele nesse período, sabendo que o valor
    // do salário é R$ 10,00/hora trabalhada.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhas por dia.");
        int nh = s.nextInt();
        System.out.println("O funcionário trabalhou " + nh * 30 + " horas no mes.");
        System.out.println("O funcionário ganhou R$" + nh * 30 * 10 + ",00 no mes.");
    }
}
