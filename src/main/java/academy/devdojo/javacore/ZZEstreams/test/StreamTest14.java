package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shitara",1.50, Category.FANTASY),
            new LightNovel("Overlord",1.59, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist",8.99, Category.FANTASY),
            new LightNovel("Blue Lock", 2.99, Category.SHONEM),
            new LightNovel("Aoshi", 3.50, Category.SHONEM),
            new LightNovel("High School of the dead", 3.90, Category.DRAMA),
            new LightNovel("Violet Evergarden", 7.50, Category.DRAMA),
            new LightNovel("Monogatari", 5.45, Category.ROMANCE)
    ));

    public static void main(String[] args) {
       Map<Category, Long> collect = lightNovels.stream()
               .collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(
                                Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect
                (Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy
                        (Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }


}
