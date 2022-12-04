package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes1 = new ArrayList<>(16);
        nomes.add("Gabriel");
        nomes.add("DevDojo");
        nomes.add("Willian");
        nomes.add("Java");
        nomes1.add("Script");
        nomes1.add("Academy");
        nomes1.add("SQL");
        nomes.remove("Java");

        nomes.addAll(nomes1);

        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("--------------");
        for (int i = 0;i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

    }
}
