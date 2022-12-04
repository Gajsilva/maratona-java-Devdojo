package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.FuncionarioPrivate;
import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("william suane");
        Consumidor consumidor2 = new Consumidor("gabriel silva");

        Manga manga1 = new Manga(5L, "Attack on titan", 20.9);
        Manga manga2 = new Manga(6L, "Sword art online Kirito", 29.9);
        Manga manga3 = new Manga(2L, "Bersek", 15.90);
        Manga manga4 = new Manga(3L, "Pokemon Arc", 35.9);
        Manga manga5 = new Manga(4L, "Bleach 2022", 39.9);

        List<Manga> mangaConsumidorList1 = List.of(manga1,manga2,manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga4,manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,  mangaConsumidorList1);
        consumidorMangaMap.put(consumidor2,  mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("--------"+entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println(manga.getNome());
            }

        }

    }
}
