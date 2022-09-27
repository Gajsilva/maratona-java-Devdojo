package academy.devdojo.javacore.IntroducaoMetodos.test;

import academy.devdojo.javacore.IntroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome ="Luffy";
        estudante01.idade =21;
        estudante01.sexo ='M';

        estudante02.nome = "Nami";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
