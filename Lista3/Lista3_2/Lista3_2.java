package lista3_2;

import java.util.Scanner;

public class Lista3_2 {
    // Leia dois conjuntos de números com a mesma quantidade. Exiba a intersecção
    // dos conjuntos, ou seja, os números que são repetidos nos dois conjuntos.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do VETOR(1) e VETOR(2): ");
        int qtd = entrada.nextInt();

        int conjunto1[] = new int[qtd];
        int conjunto2[] = new int[qtd];

        for (int i = 0; i < conjunto1.length; i++) {
            System.out.println("Digite o elemento " + i + " do VETOR(1)");
            conjunto1[i] = entrada.nextInt();
        }
        for (int j = 0; j < conjunto2.length; j++) {
            System.out.println("Digite o elemento " + j + " do VETOR(2)");
            conjunto2[j] = entrada.nextInt();
        }
        for (int i = 0; i < conjunto1.length; i++) {
            for (int j = 0; j < conjunto2.length; j++) {
                if (conjunto1[i] == conjunto2[j]) {
                    System.out.println("");
                    System.out.println("Os elementos em comum dos dois vetores é: " + conjunto1[i]);
                }
            }

        }
    }
}
