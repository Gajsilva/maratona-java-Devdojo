package academy.devdojo.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.32;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Cacular imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
