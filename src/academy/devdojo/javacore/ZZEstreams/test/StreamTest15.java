package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toList())));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln){return ln.getPrice() < 6 ? UNDER_PROMOTION :NORMAL_PRICE;}


}
