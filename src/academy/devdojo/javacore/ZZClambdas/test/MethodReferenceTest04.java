package academy.devdojo.javacore.ZZClambdas.test;

import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

//Reerence to an instance methof of an arbitrary object of a particular type
public class MethodReferenceTest04 {
    public static void main(String[] args) {
       // Supplier<AnimeComparators> newAnimeComparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators =newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk",43),
                new Anime("One Piece",950),
                new Anime("Naruto",500)
        ));
        animeList.sort(animeComparators::compareEpsodesNoStatic);
        System.out.println(animeList);

        BiFunction<String,Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String,Integer,Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Chaotic", 50));
    }
}
