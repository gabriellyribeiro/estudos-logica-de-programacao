package lista2_10;

import java.util.Scanner;

public class Lista2_10 {

    // 10. Construa um programa que leia a quantidade (Q) e o preço (PR) de vários
    // produtos diferentes, comprados por uma empresa, e apresente o total gasto por
    // ela. O final da lista de produtos deverá ser indicado pelo usuário (escolha a
    // maneira que preferir).

    public static void main(String[] args) {
        int q, pr, valor, valorTotal = 0;
        char op = 's';
        while (op == 's') {
            System.out.println("Digite a quantidade:");
            Scanner s = new Scanner(System.in);
            q = s.nextInt();
            System.out.println("Digite o valor:");
            pr = s.nextInt();
            valor = q * pr;
            valorTotal = valorTotal + valor;
            System.out.println("Deseja continuar?(S/N)");
            op = s.next().charAt(0);
        }
        System.out.println("O valor total gasto foi: " + valorTotal);
    }
}
