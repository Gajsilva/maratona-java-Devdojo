package academy.devdojo.javacore.BintroducaoMetodos.dominio;

public class FuncionarioMinhaVersao {
    public String nome;
    public int idade;
    public double salario;

    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }
    public double mediaSalario(double salario1,double salario2, double salario3){

         double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A madia dos salarios é: "+media);
        return 0;
    }
}
