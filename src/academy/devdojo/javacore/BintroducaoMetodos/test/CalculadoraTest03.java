package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(200,0);
        System.out.println(result);

        System.out.println("---------------");

        calculadora.imprimeDivisaoDoisNumeros(80,20);
    }
}
