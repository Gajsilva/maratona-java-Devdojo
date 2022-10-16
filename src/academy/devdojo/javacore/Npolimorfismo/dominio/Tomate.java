package academy.devdojo.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.6;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
