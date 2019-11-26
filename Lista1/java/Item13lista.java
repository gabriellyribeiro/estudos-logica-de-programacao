package item13lista;

import java.util.Scanner;

public class Item13lista {
    public static void main(String[] args) {
        // 13.  Dados três números, imprimi-los em ordem crescente.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero1:");
        int a = entrada.nextInt();
        System.out.println("Numero2:");
        int b = entrada.nextInt();
        System.out.println("Numero3:");
        int c = entrada.nextInt();

        if (a < b && b < c)
            System.out.println("" + a + ", " + b + ", " + c + "");
        else if (a < c && c < b)
            System.out.println("" + a + ", " + c + ", " + b + "");
        else if (b < a && a < c)
            System.out.println("" + b + ", " + a + ", " + c + "");
        else if (b < c && c < a)
            System.out.println("" + b + ", " + c + ", " + a + "");
        else if (c < a && a < b)
            System.out.println("" + c + ", " + a + ", " + b + "");
        else if (c < b && b < a)
            System.out.println("" + c + ", " + b + ", " + a + "");

    }
}
