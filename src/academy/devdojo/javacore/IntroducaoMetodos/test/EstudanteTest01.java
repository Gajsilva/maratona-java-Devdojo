package academy.devdojo.javacore.IntroducaoMetodos.test;

import academy.devdojo.javacore.IntroducaoMetodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "jotaro";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Kirito";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("-------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
