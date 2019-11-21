package item3lista;
import java.util.Scanner;
public class Item3lista {
  // 3.  Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares. 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
          System.out.println("Escolha a quantidade de elementos ímpares: ");
            int valor = entrada.nextInt();
            int vetor[] = new int[valor];
            int j=0, numero_impar=0;
            
            for(int i=0;i<valor;){   
                numero_impar++;
                if (numero_impar % 3 ==0)
                                 {
                    i++;
                    System.out.println("Ímpares: "+numero_impar);
                }
                
                
                                    }
  }
  }
    
