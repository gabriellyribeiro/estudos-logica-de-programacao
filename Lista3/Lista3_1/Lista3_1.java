package lista3_1;
import java.util.Scanner;
public class Lista3_1 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int auxiliar = 0;
      
        System.out.println("Escolha a quantidade de elementos do VETOR(1): ");
            int qtd = entrada.nextInt();
            int vetor[] = new int[qtd];
        System.out.println("Escolha a quantidade de elementos do VETOR(2): ");
            int qtd2 = entrada.nextInt();
            int vetor2[] = new int[qtd2];    
            // Esse FOR percorre os índices do vetor
         for(int g=0;g<qtd; g++){ 
        System.out.println(" Elementos do VETOR(1) índice: "+g+": ");
        vetor[g] = entrada.nextInt();}
         
         for(int valor : vetor){
                System.out.println("Desordenado V(1): "+valor);}
                
            //bubble sort, parte que ordena os vetores  
          for(int i=0; i<vetor.length; i++){
              for(int j=0; j<vetor.length; j++){
                  if(vetor[i] < vetor[j]){
                      auxiliar = vetor[i];
                      vetor[i] = vetor[j];
                      vetor[j] = auxiliar;
                  }}}
    
          for(int ordenado : vetor){
                System.out.println("Ordenado V(1): "+ordenado);           
                  }
    
             for(int j=0;j<qtd2; j++){ 
        System.out.println("Elementos do VETOR(2) índice: "+j+": ");
      vetor2[j] = entrada.nextInt();
                                 }  
      for(int valor2 : vetor2){
                System.out.println("Desordenado V(2): "+valor2);}
                
            //bubble sort, parte que ordena os vetores  
          for(int i=0; i<vetor2.length; i++){
              for(int j=0; j<vetor2.length; j++){
                  if(vetor2[i] < vetor2[j]){
                      auxiliar = vetor2[i];
                      vetor2[i] = vetor2[j];
                      vetor2[j] = auxiliar;
                  }}}
    
          for(int ordenado2 : vetor2){
                System.out.println("Ordenado V(2): "+ordenado2);           
                  }        
          int vetor3[] = new int[vetor.length+vetor2.length];
         System.arraycopy(vetor, 0, vetor3, 0, vetor.length);
         System.arraycopy(vetor2, 0, vetor3, vetor.length, vetor2.length);
    for(int i=0; i<vetor3.length; i++){
System.out.println("Tamanho VETOR(3): "+vetor3.length+" / Elementos desordenados: "+vetor3[i]); }                  
             
      for(int i=0; i<vetor3.length; i++){
              for(int j=0; j<vetor3.length; j++){
                  if(vetor3[i] < vetor3[j]){
                      auxiliar = vetor3[i];
                      vetor3[i] = vetor3[j];
                      vetor3[j] = auxiliar;
                  }}}
    
          for(int ordenado : vetor3){
                System.out.println("Ordenado VETOR (3): "+ordenado);           
                  }       
    }       
   } 


            
