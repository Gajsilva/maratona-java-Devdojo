package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
     /*   Map<Category, List<LightNovel>> categoryListNoveMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> shonem = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels){
            switch (lightNovel.getCategory()){
                case DRAMA:drama.add(lightNovel);break;
                case FANTASY:fantasy.add(lightNovel);break;
                case ROMANCE:romance.add(lightNovel);break;
                case SHONEM:shonem.add(lightNovel);break;
            }
        }
        categoryListNoveMap.put(Category.DRAMA, drama);
        categoryListNoveMap.put(Category.ROMANCE, romance);
        categoryListNoveMap.put(Category.FANTASY, fantasy);
        categoryListNoveMap.put(Category.SHONEM, shonem);
        System.out.println(categoryListNoveMap);
        System.out.println("---------------------");

      */

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
