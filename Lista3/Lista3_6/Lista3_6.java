package lista3_6;
import java.util.Scanner;
public class Lista3_6 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
       
      System.out.println("Digite a quantidade de linhas da primeira matriz:");  
       int linha= entrada.nextInt();
       System.out.println("Digite a quantidade de colunas da primeira matriz:");  
       int coluna= entrada.nextInt();
       int matriz[][]= new int [linha][coluna];
      
       System.out.println("Digite a quantidade de linhas da segunda matriz: ");  
       int linha2= entrada.nextInt();
       System.out.println("Digite a quantidade de colunas da segunda matriz: ");  
       int coluna2= entrada.nextInt();
        int matriz2[][] = new int [linha2][coluna2];
        int matriz3[][] = new int [linha][coluna2];

      if(linha==linha2 && coluna==coluna2){
          System.out.println("Válido!"); 
          for(int i=0; i<linha; i++){
   for(int j=0; j<coluna; j++){
          System.out.println("Digite o valor da posição ["+i+"]["+j+"] da matriz 1!");
         matriz[i][j]= entrada.nextInt();
   }
   }
   for(int i=0; i<linha2; i++){
   for(int j=0; j<coluna2; j++){
       System.out.println("Digite o valor da posição ["+i+"]["+j+"] da matriz 2!");
         matriz2[i][j]= entrada.nextInt();     
   }     
   }
   for(int i=0; i<linha; i++){
   for(int j=0; j<coluna2; j++){
        matriz3[i][j]= matriz[i][j]*matriz2[i][j];
          System.out.println("Os valores da terceira matriz são: "+matriz3[i][j]);
   }
   }
      }
      else{
          System.out.println("Inválido!"); 
          System.exit(0);
    }
      
}}
