package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
       // String nome = "Gabriel Silva";
       // String nome2 = new String ("Gabriel Silva");
       // System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1","iPhone");
       // Smartphone s2 = new Smartphone("1ABC1","iPhone"); esse retorna falso
        Smartphone s2 = s1; // esse retorna verdadeiro
        System.out.println(s1.equals(s2));
    }
}
