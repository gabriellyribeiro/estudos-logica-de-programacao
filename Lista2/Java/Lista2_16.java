package lista2_16;

public class Lista2_16 {

    // Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem
    // 1,10 e cresce 3 centímetros por ano. Construa um programa que calcule e
    // apresente quantos anos serão necessários para que Felisberto seja maior que
    // Anacleto.
    public static void main(String[] args) {
        Double anacleto = 1.50;
        Double felisberto = 1.10;
        int ano = 0;
        while (anacleto > felisberto) {
            anacleto = anacleto + 0.02;
            felisberto = felisberto + 0.03;
            ano = ano + 1;
        }
        System.out.println("Demorará " + ano + " anos para Felisberto ser mais alto que Anacleto");
    }
}
