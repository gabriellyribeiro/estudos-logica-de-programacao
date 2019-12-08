package lista2_13;

import java.util.Scanner;

public class Lista2_13 {
    // Construa um programa que leia vários números inteiros e mostre qual foi o
    // menor valor fornecido. Para cada valor digitado, deve ser solicitado ao
    // usuário que ele digite se ele deseja continuar entrando com valores.

    public static void main(String[] args) {
        int menor = 2147483647;
        char op = 's';
        while (op == 's') {
            System.out.println("Digite um valor:");
            Scanner s = new Scanner(System.in);
            int numero = s.nextInt();
            if (numero < menor) {
                menor = numero;
            }
            System.out.println("Deseja continuar? (S/N)");
            op = s.next().charAt(0);
            while (op != 's' && op != 'n') {
                System.out.println("Digite \"S\" ou \"N\".");
                op = s.next().charAt(0);
            }
        }
        System.out.println("O menor valor é " + menor);
    }
}
