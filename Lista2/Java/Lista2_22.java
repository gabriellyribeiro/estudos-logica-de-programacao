package lista2_22;

import java.util.Scanner;

public class Lista2_22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o valor disponivel no caixa?");
        int caixa = s.nextInt();
        int qtd = 0, pr, total = 0;
        while (qtd >= 0) {
            System.out.println("Quantidade do proximo produto");
            qtd = s.nextInt();
            if (qtd < 0) {
                break;
            }
            System.out.println("O preço do produto");
            pr = s.nextInt();
            while (pr < 0) {
                System.out.println("Digite um valor positivo");
                pr = s.nextInt();
            }
            total = qtd * pr + total;  
        }
         System.out.println("O valor total da compra é "+ total +" reais");
         if (total * 100 / caixa >= 80){
             System.out.println("A compra terá 10% de juros, " + total * 1.1 + " e será feita em 3x de " + total * 1.1 / 3 );
         }else {
             System.out.println("A compra será a vista, com 5% de desconto " + total * .95);
    }
    }
}
