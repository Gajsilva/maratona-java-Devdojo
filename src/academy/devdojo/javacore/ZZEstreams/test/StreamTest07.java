package academy.devdojo.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integer = List.of(1,2,3,4,5,6,7);
        integer.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);

        System.out.println(integer.stream().reduce(0,(x,y) -> x + y));
        System.out.println( integer.stream().reduce(0, Integer::sum));

        System.out.println("-----------------");

        integer.stream().reduce((x,y) -> x * y).ifPresent(System.out::println);
        System.out.println( integer.stream().reduce(1,(x,y) -> x * y));

        System.out.println("-----------------");

        integer.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println( integer.stream().reduce(0, Integer::max));

    }
}
