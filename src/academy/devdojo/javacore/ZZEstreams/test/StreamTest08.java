package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shitara",1.50),
            new LightNovel("Overlord",1.59),
            new LightNovel("Fullmetal Alchemist",4.99),
            new LightNovel("Blue Lock", 2.99),
            new LightNovel("Aoshi", 3.50),
            new LightNovel("High School of the dead", 3.90),
            new LightNovel("High School", 9.90)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 4)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double doubleStream = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 4)
                .sum();
        System.out.println(doubleStream);
    }
}
