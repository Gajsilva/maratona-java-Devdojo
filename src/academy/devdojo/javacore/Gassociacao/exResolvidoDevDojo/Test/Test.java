package academy.devdojo.javacore.Gassociacao.exResolvidoDevDojo.Test;

import academy.devdojo.javacore.Gassociacao.exResolvidoDevDojo.dominio.Aluno;
import academy.devdojo.javacore.Gassociacao.exResolvidoDevDojo.dominio.Local;
import academy.devdojo.javacore.Gassociacao.exResolvidoDevDojo.dominio.Professor;
import academy.devdojo.javacore.Gassociacao.exResolvidoDevDojo.dominio.Seminario;

public class Test {
    public static void main(String[] args) {
        Local local = new Local("Rua das palmeiras");
        Aluno aluno1 = new Aluno("Kirito ", 22);
        Aluno aluno2 = new Aluno("Zoro ", 21);
        Professor professor = new Professor("Barba branca", "Pirata");
        Professor professor1 = new Professor("Shanks", "Imperador Pirata");
        Aluno[] alunosParaSeminario = {aluno1,aluno2};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario,local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor1.setSeminarios(seminariosDisponiveis);

        professor.Imprime();
        professor1.Imprime();
    }
}
