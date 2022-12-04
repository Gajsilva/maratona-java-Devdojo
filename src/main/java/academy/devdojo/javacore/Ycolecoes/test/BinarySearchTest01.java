package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer>  numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(6);
        numeros.add(3);
        //(-(ponto de inserção)-1)
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,3));

        List<Manga> mangas = new ArrayList<>(6);
        MangaByIdComarator mangaByIdComarator = new MangaByIdComarator();
        mangas.add(new Manga(5L,"Attack on titan",20.9));
        mangas.add(new Manga(6L,"Sword art online Kirito",29.9));
        mangas.add(new Manga(2L,"Bersek",15.90));
        mangas.add(new Manga(3L,"Pokemon Arc",35.9));
        mangas.add(new Manga(4L,"Bleach 2022",39.9));

       // Collections.sort(mangas);

        mangas.sort(new MangaByIdComarator());

        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaTosearch = new Manga(2L,"Bersek", 15.90);

        System.out.println(Collections.binarySearch(mangas,mangaTosearch, mangaByIdComarator));

    }
}
