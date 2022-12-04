package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Sword art online Kirito");
        mangas.add("Bersek");
        mangas.add("Pokemon Arc");
        mangas.add("Bleach 2022");
        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }

        List<Double> dinheiro = new ArrayList<>(6);
        dinheiro.add(12.1);
        dinheiro.add(15.9);
        dinheiro.add(30.5);
        dinheiro.add(60.7);

        for (Double dindin : dinheiro){
            System.out.println(dindin);
        }
    }
}
