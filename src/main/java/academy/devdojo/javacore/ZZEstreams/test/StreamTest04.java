package academy.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("wildinei Suane", "Catarina Santos", "Sandy Silva");
        List<String> developers = List.of("Gabriel", "Ariel", "Lamba");
        List<String> students = List.of("Edson", "Gustavo Lima", "Gustamo Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo){
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("---------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }


}
