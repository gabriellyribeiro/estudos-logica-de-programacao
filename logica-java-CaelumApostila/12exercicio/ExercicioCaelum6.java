import java.util.Scanner;
class ExercicioCaelum6 {
    public static void main(String[] args) {
        /*  6. (opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
        Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento vale 0, o
        segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-
        ésimo elemento (ex: 8 = 5 + 3).*/
                /* Importei uma biblioteca (Scanner) para receber dados do teclado, e criei vetores
                 que guardam os valores de cada termo da sequência de fibonacci conforme a fórmula.
      
        */
        
        
        int vetor[] = new int[15];
        vetor[0]=0;
        vetor[1]=1;
        vetor[2]=1;
        
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
       
        for (int i = 3; i < 15; i++) {
        
        	vetor[i] = vetor[i-1] + vetor[i-2];
        	        
                        System.out.println(vetor[i]);     
        }
        
    }
}
