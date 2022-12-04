package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Attack on titan",20.9,5));
        mangas.add(new Manga(6L,"Sword art online Kirito",29.9,0));
        mangas.add(new Manga(2L,"Bersek",15.90,2));
        mangas.add(new Manga(3L,"Pokemon Arc",35.9,3));
        mangas.add(new Manga(4L,"Bleach 2022",39.9, 0));
        mangas.add(new Manga(4L,"Bleach 2022",39.9, 0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
