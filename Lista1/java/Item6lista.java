package item6lista;

import java.util.Scanner;

public class Item6lista {
  public static void main(String[] args) {
    // 6.  Dados n e uma sequência de n números inteiros, determinar a soma dos
    // números pares.
    Scanner entrada = new Scanner(System.in);
    System.out.println("Escolha um número: ");
    int valor = entrada.nextInt();
    int vetor[] = new int[valor];
    int i = 0;
    int somador = 0;
    for (i = 2; i <= valor; i = i + 2) {
      if ((i % 2) == 0) {
        int par = 0;
        par = par + i;
        System.out.println("Pares: " + i);
      }
      somador = somador + i;
    }
    System.out.println("Soma: " + somador);
  }
}
