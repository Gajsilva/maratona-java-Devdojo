package academy.devdojo.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("aha uhu Devdoj é foda");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("--------------------------");
        Optional<String> nameOptional = Optional.ofNullable(findName("Gabriel"));
        System.out.println(nameOptional);
        String empty = nameOptional.orElse("Empyte(Vazio)");
        nameOptional.ifPresent(String::toUpperCase);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);

        System.out.println("-------------");
        Optional <String> nameOptional2 = findName2("Gabriel");
        System.out.println(nameOptional2);
    }

    private static String findName(String name){
        List<String> list = List.of("Gabriel","DevDojo");
        int i = list.indexOf(name);
        //trocar i != 1
        if (i > 0){
            return list.get(i);
        }
        return null;
    }

    // jeito correto

    private static Optional <String> findName2(String name){
        List<String> list = List.of("Gabriel","DevDojo");
        int i = list.indexOf(name);
        //trocar i != 1
        if (i > 0){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
