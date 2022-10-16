package academy.devdojo.javacore.Npolimorfismo.service;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

   // Codigo feito em uma aula anterior. Posterior a aula foi feiro melhoramento do codigo

    // public static void calcularImpostoComputador(Computador computador){
   //     System.out.println("Relatorio de Imposto do computador");
   //     double imposto = computador.calcularImposto();

   //    System.out.println("Computador "+computador.getNome());
   //     System.out.println("Valor "+computador.getValor());
   //     System.out.println("Imposto a ser pago "+imposto);
   // }

   // public static void calcularImpostoTomate(Tomate tomate){
   //     double imposto = tomate.calcularImposto();

   //     System.out.println("Relatorio de Imposto do tomate");
   //     System.out.println("Tomate "+tomate.getNome());
   //     System.out.println("Tomate "+tomate.getValor());
   //     System.out.println("Imposto a ser pago "+imposto);
   // }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio Imposto");
        double imposto = produto.calcularImposto();

        System.out.println("Produto "+produto.getNome());
        System.out.println("Preço "+produto.getValor());
        System.out.println("Imposto a ser pago "+imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
