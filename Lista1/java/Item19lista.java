package item19lista;

import java.util.Scanner;

public class Item19lista {
    public static void main(String[] args) {
        // 19. Faça um programa que inverta e imprima os caracteres numéricos de um
        // número. Exemplo:
        // 54321 -> se torna 12345
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma sequencia de numeros inteiros positivos:");
        int valor = entrada.nextInt();
        String S = Integer.toString(valor);
        String N = "";
        for (int i = S.length(); i > 0; i--) {
            N = N + S.substring(i - 1, i);

        }
        System.out.println(N);
    }
}
