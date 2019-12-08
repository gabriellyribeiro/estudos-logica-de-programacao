package lista2_3;

import java.util.Scanner;

public class Lista2_3 {
    // Construa um programa que leia o número de horas trabalhadas diárias (NH) de
    // um funcionário por um período de 30 dias (ele trabalhou todos os 30 dias) e
    // apresente o total de horas trabalhadas por ele nesse período.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhas por dia.");
        int nh = s.nextInt();
        System.out.println("O funcionário trabalhou " + nh * 30 + " horas no mes.");
    }
}
