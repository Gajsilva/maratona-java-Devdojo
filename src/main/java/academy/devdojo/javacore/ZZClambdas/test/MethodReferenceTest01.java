package academy.devdojo.javacore.ZZClambdas.test;

import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk",43),
                new Anime("One Piece",950),
                new Anime("Naruto",500)
        ));
        Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(animeList);

        Collections.sort(animeList, AnimeComparators::compareByTitle);
       System.out.println(animeList);

        Collections.sort(animeList, AnimeComparators::compareEpsodes);
        System.out.println(animeList);

    }
}
