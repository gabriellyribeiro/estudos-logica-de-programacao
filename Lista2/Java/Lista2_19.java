package lista2_19;

import java.util.Scanner;

public class Lista2_19 {

    public static void main(String[] args) {
        int id,pessoa=0,media=0,a=0,b=0,c=0,d=0,e=0;
        char op,pesquisa = 's';

        while (pesquisa == 's') {
            System.out.println("Digite sua idade:");
            Scanner s = new Scanner(System.in);
            id = s.nextInt();

            while (id <= 0) {
                System.out.println("A idade não pode ser negativa. Tente novamente");
                id = s.nextInt();
            }

            System.out.println("Sobre o filme: "+"A = Ótimo "+"B = Bom "+"C = Regular "+"D = Ruim "+"E = Péssimo");
            op = s.next().charAt(0);

            while (op != 'a' && op != 'b' && op != 'c' && op != 'd' && op != 'e' && op != 'f') {
                System.out.println("Digite A ou B ou C ou D ou E.");
                op = s.next().charAt(0);
            }

            if (op == 'a') {
                a = a + 1;
            } else if (op == 'b') {
                b = b + 1;
            } else if (op == 'c') {
                c = c + 1;
            } else if (op == 'd') {
                d = d + 1;
            } else if (op == 'e') {
                e = e + 1;
            }

            pessoa = pessoa + 1;
            media = media + id;
            
            System.out.println("Continuar pesquisa?(S/N)");
            pesquisa = s.next().charAt(0);
            while (pesquisa != 's' && pesquisa != 'n') {
                System.out.println("Digite \"S\" ou \"N\".");
                pesquisa = s.next().charAt(0);
            }
        }
        System.out.println(pessoa + " pessoa responderam a pesquisa");
        System.out.println("A média das idade é: " + media / pessoa);
        int porcentagem = a + b + c + d + e;
        System.out.println((a * 100) / porcentagem+"% Acharam ótimo");
        System.out.println((b * 100) / porcentagem+"% Acharam bom");
        System.out.println((c * 100) / porcentagem+"% Acharam regular");
        System.out.println((d * 100) / porcentagem+"% Acharam ruim");
        System.out.println((e * 100) / porcentagem+"% Acharam péssimo");
    }
}
