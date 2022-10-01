package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "jotaro";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Kirito";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

       impressora.Imprime(estudante1);

       impressora.Imprime(estudante2);

       impressora.Imprime(estudante1);
       impressora.Imprime(estudante2);
    }
}
