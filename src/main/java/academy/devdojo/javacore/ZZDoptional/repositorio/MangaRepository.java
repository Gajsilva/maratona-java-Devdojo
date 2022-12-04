package academy.devdojo.javacore.ZZDoptional.repositorio;

import academy.devdojo.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(
            new Manga(1,"Boku no Hero",50),
            new Manga(2,"Overlord",30),
            new Manga(3,"Aoshi",10)
    );
    public static Optional<Manga> findbyId(Integer id){
        return findby(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findbyTitle(String title){
       return findby(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findby(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
