package academy.devdojo.javacore.Gassociacao.ex.Test;

import academy.devdojo.javacore.Gassociacao.ex.dominio.Estudante;
import academy.devdojo.javacore.Gassociacao.ex.dominio.Professor;
import academy.devdojo.javacore.Gassociacao.ex.dominio.Seminario;

public class SistemaTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Naruto", +15);
        Estudante estudante2 = new Estudante("Pain", 25);

        Professor professor = new Professor("Kakashi-senpai", "Ambu");
        Professor[] professores = {professor};

        Seminario seminario = new Seminario("Seminario de Filosofia", "Konoha", professores);
        Seminario seminario1 = new Seminario("Seminario de Jutsu de selamento", "aldeia da chuva",
                professores);

        estudante2.setSeminario(seminario);
        estudante1.setSeminario(seminario);

        estudante1.imprime();

        System.out.println("------------");
        estudante2.imprime();

        System.out.println("------------");
        seminario.imprime(estudante1);

        System.out.println("------------");
        seminario1.imprime(estudante1);

        System.out.println("------------");
        seminario.imprime(estudante1);

        System.out.println("------------");
        seminario1.imprime(estudante2);

    }
}
