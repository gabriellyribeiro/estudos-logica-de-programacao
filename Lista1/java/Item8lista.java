package item8lista;

import java.util.Scanner;

public class Item8lista {
    public static void main(String[] args) {
        // 8.  Dado um inteiro positivo p, verificar se p é primo.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor para verificar se é primo:");
        int numero = entrada.nextInt();
        if ((numero % 2) != 0 || numero == 2) {
            if ((numero % 3) != 0 || numero == 3) {

                System.out.println("É primo!");
            } else {
                System.out.println("Nao é primo!");
            }
        } else {
            System.out.println("Não é primo!");
        }
    }
}
