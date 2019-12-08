package lista2_18;

import java.util.Scanner;

public class Lista2_18 {
    // Construa um programa que apresente a tabuada de um número N. O valor de N
    // será apresentado pelo usuário.

    public static void main(String[] args) {
        System.out.println("Digite o valor para calcular a tabuada:");
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            int tabuada = valor * i;
            System.out.println(valor + " x " + i + " = " + tabuada);
        }
    }
}
