package lista2_7;

import java.util.Scanner;

public class Lista2_7 {

    // Exercicio fatorial, onde N é definido pelo usuário

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long total = 1;
        System.out.println("Digite o numero para fazer o fatorial:");
        int numero = s.nextInt();
        while (numero < 0) {
            System.out.println("Digite um numero positivo:");
            numero = s.nextInt();
        }
        for (int i = 1; i <= numero; i++) {
            total = total * i;
            System.out.print(" x " + i);
        }
        System.out.print(" = " + total);
    }
}
