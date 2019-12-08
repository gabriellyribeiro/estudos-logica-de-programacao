package lista3_3;
import java.util.Scanner;
public class Lista3_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numeros inteiros :");
        int valor = entrada.nextInt();
        String S = Integer.toString( valor );
        String N = "";
        for(int i=S.length(); i>0; i--) {
            N = N + S.substring(i-1, i);
            
        }
        System.out.println("Ordem inversa: "+N );
    }
    }