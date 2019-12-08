package lista3_4;
import java.util.Scanner;
public class Lista3_4 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite a quantidades de alunos.");
        int qtd = ent.nextInt();
        
        String aluno[] = new String[qtd];
        double nota[] = new double[qtd];
        
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o nome do " + (i+1) + "º aluno.");
            aluno[i] = ent.next();
            System.out.println("Digite a nota do " + (i+1) + "º aluno");
            nota[i] = ent.nextInt();        
        }
        
        double contaNota = 0;       
        for(int y = 0; y < nota.length; y++){
            contaNota += nota[y];        
        }
        double media = contaNota / qtd;
        
        for(int x = 0; x < qtd; x++){
            if(nota[x] >= media){
                System.out.println("O aluno(a) " + aluno[x] + " teve a nota " + nota[x]);
            }
        }
    }
}