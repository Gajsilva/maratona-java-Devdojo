package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComarator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        //return o1.getId().compareTo(o2).getId();
        return 0;
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan",20.9));
        mangas.add(new Manga(6L,"Sword art online Kirito",29.9));
        mangas.add(new Manga(2L,"Bersek",15.90));
        mangas.add(new Manga(3L,"Pokemon Arc",35.9));
        mangas.add(new Manga(4L,"Bleach 2022",39.9));
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-------------------------");
        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComarator());
        System.out.println("-------------------------");
        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
