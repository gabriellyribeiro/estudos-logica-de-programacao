package item12lista;

import java.util.Scanner;

public class Item12lista {

    public static void main(String[] args) {
        // 12.  Dados três números naturais, verificar se eles formam os lados de um
        // triângulo retângulo.
        Scanner entrada = new Scanner(System.in);
        int catetos;
        int resultado;
        System.out.println("Receba lado 1:");
        int lado1 = entrada.nextInt();
        System.out.println("Receba lado 2:");
        int lado2 = entrada.nextInt();
        System.out.println("Receba lado 3:");
        int lado3 = entrada.nextInt();
        int soma;
        soma = lado1 + lado2;
        if (soma == lado3) {
            System.out.println("Sim! Forma um triângulo retângulo..." + soma);
        } else {
            System.out.println("O terceiro valor não forma um triângulo retângulo!");
        }

    }

}
