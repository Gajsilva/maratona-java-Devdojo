package academy.devdojo.javacore.Heheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu"+this.getNome()+" recebi o salario "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
