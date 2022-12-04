package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy (ln ->
                ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);
    }


}
