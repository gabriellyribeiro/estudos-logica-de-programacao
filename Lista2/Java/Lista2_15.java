package lista2_15;

import java.util.Scanner;

public class Lista2_15 {
    // Construa um programa que leia um número e indique se ele é par ou impar. O
    // programa só deve levar em consideração valores positivos.

    public static void main(String[] args) {
        System.out.println("Digite um valor:");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        if (numero < 0) {
            System.out.println("Digite apenas números positivos!");
        } else if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é Par");
        } else {
            System.out.println("O numero " + numero + " é Impar");
        }
    }
}
