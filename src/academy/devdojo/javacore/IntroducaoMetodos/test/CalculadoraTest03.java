package academy.devdojo.javacore.IntroducaoMetodos.test;

import academy.devdojo.javacore.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);

        System.out.println(result);
    }
}
