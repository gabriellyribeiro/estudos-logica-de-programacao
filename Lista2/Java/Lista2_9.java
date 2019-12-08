package lista2_9;

import java.util.Scanner;

public class Lista2_9 {
    // Construa um programa que leia o conjunto de 20 números inteiros e mostre qual
    // foi o maior e o menor valor fornecido.

    public static void main(String[] args) {
        int menor = 2147483647;
        int maior = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º valor:");
            Scanner s = new Scanner(System.in);
            int numero = s.nextInt();
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("o menor valor é: " + menor);
        System.out.println("o maior valor é: " + maior);
    }
}
