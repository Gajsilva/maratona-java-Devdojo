package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3 )
                .findAny()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(lm -> lm.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(lm -> lm.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
