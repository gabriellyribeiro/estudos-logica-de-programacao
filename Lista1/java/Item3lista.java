package item3lista;

import java.util.Scanner;

public class Item3lista {
  // 3.  Dado um número inteiro positivo n, imprimir os n primeiros naturais
  // ímpares
  public static void main(String[] args) {
    // Pegando a entrada
    Scanner sn = new Scanner(System.in);
    System.out.println("Escolha a quantidade de elementos ímpares: ");
    int entrada = sn.nextInt();

    // Gerando um vetor para contagem
    int tamanho = entrada * 2;
    int[] contagem = new int[tamanho];
    for (int i = 0; i < tamanho; i++) {
      contagem[i] = i + 1;
    }

    // Encontrando impares dentro do array de contagem
    int[] impares = new int[entrada];
    for (int i = 0; i < contagem.length; i++) {
      if (contagem[i] % 2 == 1) {
        impares[i] = contagem[i];
        System.out.println(contagem[i]);
      }
    }

  }
}
