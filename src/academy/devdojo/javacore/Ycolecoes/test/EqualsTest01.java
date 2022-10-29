package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smatphone;

public class EqualsTest01 {
    public static void main(String[] args) {
       // String nome = "Gabriel Silva";
       // String nome2 = new String ("Gabriel Silva");
       // System.out.println(nome.equals(nome2));

        Smatphone s1 = new Smatphone("1ABC1","iPhone");
       // Smatphone s2 = new Smatphone("1ABC1","iPhone"); esse retorna falso
        Smatphone s2 = s1; // esse retorna verdadeiro
        System.out.println(s1.equals(s2));
    }
}
