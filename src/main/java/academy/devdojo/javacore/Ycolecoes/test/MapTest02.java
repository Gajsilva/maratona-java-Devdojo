package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("william suane");
        Consumidor consumidor2 = new Consumidor("william suane");

        Manga manga1 = new Manga(5L, "Attack on titan", 20.9);
        Manga manga2 = new Manga(6L, "Sword art online Kirito", 29.9);
        Manga manga3 = new Manga(2L, "Bersek", 15.90);
        Manga manga4 = new Manga(3L, "Pokemon Arc", 35.9);
        Manga manga5 = new Manga(4L, "Bleach 2022", 39.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue().getNome());
        }
    }
}
