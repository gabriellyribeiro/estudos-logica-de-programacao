package item9lista;

import java.util.Scanner;

public class Item9lista {
  public static void main(String[] args) {
    // Faça a sequência de Fibonacci
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o número p/ obter a sequência: ");
    int termo = entrada.nextInt();
    int vetor[] = new int[termo];
    vetor[0] = 1;
    vetor[1] = 1;

    for (int i = 2; i < termo; i++) {
      vetor[i] = vetor[i - 1] + vetor[i - 2];
      System.out.println(vetor[i]);
    }
  }
}
