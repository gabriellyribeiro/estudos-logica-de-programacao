package item7lista;

import java.util.Scanner;

public class Item7lista {
    public static void main(String[] args) {
        // 7.  Dado um inteiro não-negativo n, determinar n!
        Scanner entrada = new Scanner(System.in);
        int fat = 1;
        System.out.println("Digite um valor positivo:");
        int numero = entrada.nextInt();
        if (numero <= 0) {
            System.out.println("O valor não é positivo! Tente novamente. ");
            System.exit(0);
        }
        for (int i = 1; i <= numero; i++) {
            fat = fat * i;

        }
        System.out.println("O fatorial de " + numero + " é " + fat);

    }
}
