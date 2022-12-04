package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midorya");
        lista.add("Midorya");

        for (String o : lista){
            System.out.println(o);
        }
        add(lista, new Consumidor("kacha"));

        for (Object o : lista){
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
