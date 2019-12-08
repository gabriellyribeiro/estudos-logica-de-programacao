package lista2_17;

import java.util.Scanner;

public class Lista2_17 {
    // 17. Construa um programa que calcule a área total de uma residência (sala,
    // cozinha, quartos, etc., sendo todos eles retangulares). O usuário deverá
    // entrar com a largura (L) e o comprimento (C) de cada cômodo da casa. Em
    // seguida deverá ser apresentada uma pergunta, solicitando a confirmação do
    // usuário para continuar com a entrada de dados (a confirmação será dada quando
    // o usuário entrar com “S”). Caso ele entre com o valor “N”. Deverá ser
    // apresentada a área total da casa.

    public static void main(String[] args) {
        int largura, comprimento, area, areaTotal = 0;
        char op = 's';
        while (op == 's') {
            System.out.println("Digite a largura:");
            Scanner s = new Scanner(System.in);
            largura = s.nextInt();
            System.out.println("Digite o comprimento:");
            comprimento = s.nextInt();
            area = largura * comprimento;
            areaTotal = areaTotal + area;
            System.out.println("Deseja continuar?(S/N)");
            op = s.next().charAt(0);
            while (op != 's' && op != 'n') {
                System.out.println("Digite \"S\" ou \"N\".");
                op = s.next().charAt(0);
            }
        }

        System.out.println("A area total é: " + areaTotal + "m²");

    }
}
