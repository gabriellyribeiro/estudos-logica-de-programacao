package lista2_21;

import java.util.Scanner;

public class Lista2_21 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char op = 's';
        double valorTotal = 0;
        while (op == 's') {
            System.out.println("Digite o valor da etiqueta");
            int valor = s.nextInt();
            valorTotal = valorTotal + valor;
            System.out.println("Mais produtos? (S/N)");
            op = s.next().charAt(0);
            while (op != 's' && op != 'n') {
                System.out.println("Digite \"S\" ou \"N\".");
                op = s.next().charAt(0);
            }
        }
            System.out.println("Forma de pagamentos:");
            System.out.println("(1)À vista em cash: 10% desconto. " + "(2)À vista no cartão: 5% desconto.");
            System.out.println("(3)Em duas vezes sem juros. " + "(4)Em três vezes com 10% de juros.");
            int pagamento = s.nextInt();
            while (pagamento != 1 && pagamento != 2 && pagamento !=3 && pagamento !=4){
                System.out.println("Digite um forma de pagamente valida");
                pagamento = s.nextInt();             
            }
         
                if (pagamento == 1){
                valorTotal = valorTotal * .9; 
                System.out.println("O valor a ser pago é " + valorTotal + " já com os 10% de desconto.");
            }else if (pagamento == 2){
                valorTotal = valorTotal * .8;
                System.out.println("O valor a ser pago é " + valorTotal + " já com os 5% de desconto.");
            }else if (pagamento == 3){                
                System.out.println("O valor a ser pago é " + valorTotal + " sem juros.");
            }else if (pagamento == 4){
                valorTotal = valorTotal * 1.1;
                System.out.println("O valor a ser pago é " + valorTotal + " já com os 10% de juros.");
            }    
    }
}
