package lista2_8;

import java.util.Scanner;

public class Lista2_8 {

    public static void main(String[] args) {

        int maior = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o "+i+"º valor:");
            Scanner s = new Scanner(System.in);
            int numero = s.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("o maior valor é: " + maior);
    }
}
