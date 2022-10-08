package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.javacore.Gassociacao.ex.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya sensei", "sennin");
        Professor professor2 = new Professor("Kakashi", "jonin");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
