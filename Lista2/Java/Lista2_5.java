package lista2_5;

public class Lista2_5 {
    // A conversão de graus Fahrenheit para Celsius é obtida pela fórmula
    // C=5/9(F-32). Construa um programa que calcule e apresente TODAS as
    // temperaturas (em Celsius) correspondentes aquelas em Fahrenheit de 1 até 50,
    // ou seja, para cada temperatura em Fahrenheit, variando de 1 até 50, calcular
    // e apresentar uma temperatura em Celsius.
    public static void main(String[] args) {
        for (int f = 1; f <= 50; f++) {
            double c = (f - 32) / 1.8;
            System.out.println(f + " Fahrenheit é equivalente a " + c + " Celsius");

        }
    }
}
