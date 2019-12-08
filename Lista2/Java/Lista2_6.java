package lista2_6;

import java.util.Scanner;

public class Lista2_6 {
    // 6. Construa um programa que apresente o valor de H, sendo H calculado por:
    // H=1+2+3+4+...+ N
    // O valor de N será apresentado pelo usuário.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        System.out.println("Somar de 1 até:");
        int numero = s.nextInt();
        for (int i = 1; i <= numero; i++) {
            total = total + i;
            System.out.print(" + " + i);
        }
        System.out.print(" = " + total);

    }
}
