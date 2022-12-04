package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        MangaByIdComarator mangaByIdComarator = new MangaByIdComarator();
        mangas.add(new Manga(5L,"Attack on titan",20.9, 5));
        mangas.add(new Manga(6L,"Sword art online Kirito",29.9,8));
        mangas.add(new Manga(2L,"Bersek",15.90,9));
        mangas.add(new Manga(3L,"Pokemon Arc",35.9,3));
        mangas.add(new Manga(4L,"Bleach 2022",39.9,0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            if (mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
