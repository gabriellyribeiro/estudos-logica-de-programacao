package itemlista5;

import java.util.Scanner;

public class Itemlista5 {
    // 5.  Uma loja de discos anota diariamente durante o mês de março a quantidade
    // de discos vendidos. Determinar em que dia desse mês ocorreu a maior venda e
    // qual foi a quantidade de discos vendida nesse dia.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes[] = new int[31];
        int maior = 0;
        int dia = 0;

        for (int i = 1; i <= mes.length; i++) {
            System.out.println("Dia " + i + ", digite a quantidade da venda: ");
            int valor = entrada.nextInt();
            if (valor > maior) {
                maior = valor;
                dia = i;

            }
        }
        System.out.println("O dia " + dia + " obteve maior lucro, vendendo " + maior + " discos");

    }
}
