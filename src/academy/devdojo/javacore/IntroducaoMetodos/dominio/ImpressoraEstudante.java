package academy.devdojo.javacore.IntroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void Imprime(Estudante estudante){
        System.out.println("-------------------");



        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}
