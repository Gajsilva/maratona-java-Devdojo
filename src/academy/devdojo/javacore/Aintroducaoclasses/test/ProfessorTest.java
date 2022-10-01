package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Jiraya";
        professor.sexo = 'M';
        professor.idade = 40;

        System.out.println(professor.nome + " idade: " +professor.idade +
                " sexo: " +
                " "+professor.sexo );
    }
}
