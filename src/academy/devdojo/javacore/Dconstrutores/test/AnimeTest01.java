package academy.devdojo.javacore.Dconstrutores.test;
import academy.devdojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuuu","TV", 12, "Açao", "Galpao");

        anime.imprime();
    }
}
