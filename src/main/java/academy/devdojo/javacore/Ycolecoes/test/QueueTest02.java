package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Attack on titan",20.9));
        mangas.add(new Manga(6L,"Sword art online Kirito",29.9));
        mangas.add(new Manga(2L,"Bersek",15.90));
        mangas.add(new Manga(3L,"Pokemon Arc",35.9));
        mangas.add(new Manga(4L,"Bleach 2022",39.9));
            while (!mangas.isEmpty()){
                System.out.println(mangas.poll());
            }

    }
}
