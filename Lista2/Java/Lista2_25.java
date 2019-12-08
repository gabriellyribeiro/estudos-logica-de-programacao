package lista2_25;

import java.util.Scanner;

public class Lista2_25 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a hora da entrada:");
        double he = s.nextInt();
        while (he < 0 || he > 23) {
            System.out.println("Digite entre 0 e 23:");
            he = s.nextInt();
        }
        System.out.println("Digite os minutos da entrada:");
        double me = s.nextInt();
        while (me < 0 || me > 59) {
            System.out.println("Digite entre 0 e 59:");
            me = s.nextInt();
        }
        System.out.println("Digite a hora da saida:");
        double hs = s.nextInt();
        while (hs < 0 || hs > 23) {
            System.out.println("Digite entre 0 e 23:");
            hs = s.nextInt();
        }
        System.out.println("Digite os minutos da saida:");
        double ms = s.nextInt();
        while (ms < 0 || ms > 59) {
            System.out.println("Digite entre 0 e 59:");
            ms = s.nextInt();
        }
        int minutoRedondo = 0;
        if (me > ms) {
            minutoRedondo = 0;
        } else if (me < ms) {
            minutoRedondo = 1;
        }

        double horaTotal = hs - he + minutoRedondo;

        System.out.println("tempo a ser cobrado: " + horaTotal + " horas.");
        
        if (horaTotal == 1) {
            horaTotal = 4;
        } else if (horaTotal == 2) {
            horaTotal = 6;
        } else {
            horaTotal = (horaTotal - 2) + 10;
        }
        System.out.println("O valor a ser pago é R$" + horaTotal + "0.");
    }
}
