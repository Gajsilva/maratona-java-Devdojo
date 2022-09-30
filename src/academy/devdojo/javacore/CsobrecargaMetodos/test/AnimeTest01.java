package academy.devdojo.javacore.CsobrecargaMetodos.test;

import academy.devdojo.javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Full metal Alchemist", "TV", 12, "Açao");

        anime.imprime();

    }
}
