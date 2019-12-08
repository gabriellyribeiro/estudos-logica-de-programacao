package lista2_23;

import java.util.Scanner;

public class Lista2_23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sal = 0, salTotal = 0, contSal = 0;
        double contSalTotal = 0, sal_novo = 0;
        while (sal >= 0) {
            System.out.println("Qual o salario atual?");
            sal = s.nextInt();
            if (sal < 0){
            break;
            }
            contSal = contSal + sal;
            if (sal < 500) {
                sal_novo = sal * 1.15;
                 System.out.println("O novo salario será " + sal_novo + " reais.");
            } else if (sal >= 500 && sal < 1000) {
                sal_novo = sal * 1.10;
                System.out.println("O novo salario será " + sal_novo + " reais.");
            } else {
                sal_novo = sal * 1.05;
                System.out.println("O novo salario será " + sal_novo + " reais.");
            }  
            contSalTotal = contSalTotal + sal_novo;
        }
        System.out.println("O valor gasto a mais pela empresa será " + (contSalTotal - contSal) + " reais.");
    }
}
