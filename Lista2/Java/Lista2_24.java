package lista2_24;

import java.util.Scanner;

public class Lista2_24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o dia de nascimento?");
        int dia = s.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.println("Digite o dia entre 1 e 31");
            dia = s.nextInt();
        }
        System.out.println("Digite o mes de nascimento?");
        int mes = s.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Digite o mes entre 1 e 12");
            mes = s.nextInt();
        }
        System.out.println("Digite o ano de nascimento?");
        int ano = s.nextInt();
        System.out.println("Digite o dia atual");
        int diaAtual = s.nextInt();
        while (diaAtual < 1 || diaAtual > 31) {
            System.out.println("Digite o dia entre 1 e 31");
            diaAtual = s.nextInt();
        }
        System.out.println("Digite o mes atual");
        int mesAtual = s.nextInt();
        while (mesAtual < 1 || mesAtual > 12) {
            System.out.println("Digite o mes entre 1 e 12");
            mesAtual = s.nextInt();
        }
        System.out.println("Digite o ano atual");
        int anoAtual = s.nextInt();

        int idadeAno = anoAtual - ano, idadeMes, idadeDia;

        if (mesAtual < mes) {
            idadeAno = idadeAno - 1;
            idadeMes = 12 - (mes - mesAtual);
        } else {
            idadeMes = mesAtual - mes;
        }
        if (dia >= diaAtual) {
            idadeDia = dia - diaAtual;
        } else {
            idadeDia = diaAtual - dia;
        }
        System.out.println("Você tem " + idadeAno + " anos, " + idadeMes + " mes(es) e, " + idadeDia + " dia(s).");
    }
}
