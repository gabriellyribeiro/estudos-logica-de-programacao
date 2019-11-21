package item2lista;
import java.util.Scanner;
public class Item2lista {
    // 2.  Dado um número inteiro positivo n, calcular a soma dos n primeiros números naturais. 
public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Digite um número inteiro positivo: ");
            int valor = entrada.nextInt();
            int vetor[] = new int[valor];
            if(valor <=0){
        System.out.println("Você digitou um valor nulo, tente novamente!");
        System.exit(0);
    } 
           else if(valor>=1){
      System.out.println("A soma dos "+valor+" primeiros números naturais é: "+valor*(valor+1)/2);
         }
}
}

          

