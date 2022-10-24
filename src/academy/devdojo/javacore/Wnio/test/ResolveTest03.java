package academy.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/gabriel");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/gabriel");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.text");

        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));
        System.out.println("3 "+absoluto.resolve(absoluto));
        System.out.println("4 "+absoluto.resolve(file));
        System.out.println("5 "+file.resolve(absoluto));
        System.out.println("6 "+file.resolve(relativo));

    }
}
