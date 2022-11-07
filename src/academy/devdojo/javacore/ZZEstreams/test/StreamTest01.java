package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shitara",1.50),
            new LightNovel("Overlord",1.59),
            new LightNovel("Fullmetal Alchemist",4.99),
            new LightNovel("Blue Lock", 2.99),
            new LightNovel("Aoshi", 3.50),
            new LightNovel("High School of the dead", 3.90)
    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
