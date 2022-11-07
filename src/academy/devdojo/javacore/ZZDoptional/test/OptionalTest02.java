package academy.devdojo.javacore.ZZDoptional.test;

import academy.devdojo.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findbyTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findbyId(3)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga mangaNew = MangaRepository.findbyTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(mangaNew);
    }
}
