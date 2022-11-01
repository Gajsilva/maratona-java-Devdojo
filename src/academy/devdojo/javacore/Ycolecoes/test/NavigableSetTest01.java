package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphonMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphonMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Attack on titan",20.9,5));
        mangas.add(new Manga(6L,"Sword art online Kirito",29.9,0));
        mangas.add(new Manga(2L,"Bersek",15.90,2));
        mangas.add(new Manga(3L,"Pokemon Arc",35.9,3));
        mangas.add(new Manga(4L,"Bleach 2022",39.9, 0));
        mangas.add(new Manga(4L,"Bleach 2022",39.9, 0));
        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
