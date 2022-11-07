package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shitara",1.50),
            new LightNovel("Overlord",1.59),
            new LightNovel("Fullmetal Alchemist",4.99),
            new LightNovel("Blue Lock", 2.99),
            new LightNovel("Aoshi", 3.50),
            new LightNovel("High School of the dead", 3.90)
    ));
    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 3)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }

}
