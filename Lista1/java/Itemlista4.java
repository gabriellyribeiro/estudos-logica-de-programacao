package itemlista4;

import java.util.Scanner;

// 4.  Dado um inteiro x e um inteiro não-negativo n, calcular x elevado a n. 
public class Itemlista4 {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          int i;
          int resultado = 1;
          System.out.println("Digite um valor inteiro, base: ");
          int base = entrada.nextInt();

          System.out.println("Digite um valor inteiro não negativo, expoente: ");
          int expoente = entrada.nextInt();

          if (expoente < 0) {
               System.out.println("Você digitou um expoente negativo, tente novamente!");
               System.exit(0);
          }
          for (i = 1; i <= expoente; i++) {
               resultado = resultado * base;
          }
          System.out.println(+base + " elevado à " + expoente + " é: " + resultado);
     }
}
