package lista4_1.pkg8;

import java.util.Scanner;

public class Lista4_18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AbrirConta conta = new AbrirConta();
        System.out.println("Digite o saldo da conta:");
        conta.saldo = s.nextInt();
        conta.verficaSaldo();
    }
}
