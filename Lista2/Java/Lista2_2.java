package lista2_2;

import java.util.Scanner;

public class Lista2_2 {
    // Construa um programa que leia a quantidade (Q) e o preço (PR) de 45 produtos
    // diferentes, comprados por uma empresa, e apresente o total gasto por ela.

    public static void main(String[] args) {
        int valor = 0, valorTotal = 0;
        for (int i = 1; i <= 25; i++) {
            System.out.println("Digite a quantidade do produto " + i);
            Scanner s = new Scanner(System.in);
            int quantidade = s.nextInt();
            System.out.println("Digite o valor do produto " + i);
            int produto = s.nextInt();
            valor = quantidade * produto;
            valorTotal = valorTotal + valor;
        }

        System.out.println("O valor total gasto será R$" + valorTotal + ",00");
    }
}
