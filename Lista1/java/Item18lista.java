package item18lista;

import java.util.Scanner;

public class Item18lista {
    public static void main(String[] args) {
        // 18. Faça um programa que troca o valor de duas variáveis inteiras.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero1:");
        int a = entrada.nextInt();
        System.out.println("Numero2:");
        int b = entrada.nextInt();

        int c;
        c = a; // guardando o valor de a
        a = b; // sobreescrevendo o valor a
        b = c; // sobreescrevendo o valor c

        System.out.println("Variáveis trocadas: " + a + " , " + b + "");

    }
}
