package item1lista;
import java.util.Scanner;
public class Item1lista {
    public static void main(String[] args) {
        //Aqui estou criando vetores que terá a posição conforme o usuário digitar;
         Scanner entrada = new Scanner(System.in); 
        System.out.println("Primeiro número da sequência");
        int numero= entrada.nextInt();
        int vetor[]= new int [numero];
        if(numero<=0){
        System.out.println("Você digitou um valor nulo, tente novamente!");
        System.exit(0);
    }
        for(int i=0; numero>0; i++){
            System.out.println("O quadrado do número: "+numero+" é "+numero*numero); 
            numero--;
        }
    }  
}
        
    