package lista2_11;

import java.util.Scanner;

public class Lista2_11 {

    public static void main(String[] args) {
        // Construa um programa que leia vários números inteiros e positivos, calculando
        // ao final da seqüência a soma e a média desses números. A seqüência termina
        // quando o usuário entrar com um valor negativo (esse valor não deve fazer
        // parte de nenhum dos cálculos).

        int soma = 0;
        int numero = 0;
        int media = 0;

        while (numero >= 0) {
            System.out.println("Digite um valor:");
            Scanner s = new Scanner(System.in);
            numero = s.nextInt();
            if (numero <= 0) {
                break;
            }
            soma = soma + numero;
            media = media + 1;
        }
        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A media dos numeros é: " + soma / media);
    }
}
