package lista2_12;

import java.util.Scanner;

public class Lista2_12 {
    // Construa um programa que leia vários números inteiros e mostre qual foi o
    // maior valor fornecido. O final da lista de produtos será indicado quando o
    // usuário entrar com um valor negativo (esse valor não deve fazer parte da
    // comparação de valores).

    public static void main(String[] args) {
        int maior = 0;
        int numero = 1;

        while (numero > 0) {
            System.out.println("Digite um valor:");
            Scanner s = new Scanner(System.in);
            numero = s.nextInt();
            if (numero <= 0) {
                break;
            } else if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior valor fornacido foi: " + maior);
    }
}
