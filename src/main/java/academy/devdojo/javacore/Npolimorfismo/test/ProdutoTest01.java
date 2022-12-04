package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung\" ",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");

        CalculadoraImposto.calcularImposto(televisao);
    }
}
