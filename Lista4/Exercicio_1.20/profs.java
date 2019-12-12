package professores;

import professores.Professores;

public class profs {
  public static void main(String arg[]) {
    Professores p1 = new Professores();
    Professores p2 = new Professores();
    Professores p3 = new Professores();
    Professores p4 = new Professores();
    Professores p5 = new Professores();

    p1.sexo = 'm';
    p1.nome = "Rubens Menezes ";
    p1.disciplina = "- HTML5, CSS3 e Bootstrap";
    p1.cidade = " São Roque";
    p1.instituicao = " Fatec";

    p2.sexo = 'm';
    p2.nome = "Luis Palma ";
    p2.disciplina = "- Lógica de programação e JAVA";
    p2.cidade = " São Roque";
    p2.instituicao = " Fatec";

    p3.sexo = 'm';
    p3.nome = "Ademar Branco ";
    p3.disciplina = "- Inglês";
    p3.cidade = " Sorocaba";
    p3.instituicao = " Fatec";

    p5.sexo = 'm';
    p5.nome = "Ali Hassan ";
    p5.disciplina = "- Javascript, TypesScript, NodeJs e AngularJs";
    p5.cidade = "  São Paulo";
    p5.instituicao = "Generation - Bootcamp";

    System.out.println(p1.nome + p1.disciplina + p1.instituicao);
    System.out.println(p2.nome + p2.disciplina + p2.instituicao);
    System.out.println(p3.nome + p3.disciplina + p3.instituicao);
    System.out.println(p5.nome + p5.disciplina + p5.instituicao);
  }
}
