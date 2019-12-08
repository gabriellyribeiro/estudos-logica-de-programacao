package lista2_20;

import java.util.Scanner;

public class Lista2_20 {
    public static void main(String[] args) {
        int ht;
        int vh;
        char op = 's';
        while (op == 's'){
            System.out.println("Digite as horas trabalhadas:");
            Scanner s = new Scanner(System.in);
            ht = s.nextInt();
            
            System.out.println("Digite o valor da hora:");
            vh = s.nextInt();
            
            int salario = ht * vh;
            double salarioBruto = salario * .89;
            
            if (salarioBruto <= 900){
                System.out.println("O Salario liquido é: "+salarioBruto);
            } 
            else if(salarioBruto >= 1800){
                System.out.println("O Salario liquido é: "+(salarioBruto * .85 - 360));
            }else{
            System.out.println("O Salario liquido é: "+(salarioBruto * .735 - 135));
            }
            System.out.println();
            System.out.println("Há outro funcionario? (S/N)");
            op = s.next().charAt(0);
            while (op != 's' && op != 'n') {
                System.out.println("Digite \"S\" ou \"N\".");
                op = s.next().charAt(0);
            }
            
        }
    }
}
