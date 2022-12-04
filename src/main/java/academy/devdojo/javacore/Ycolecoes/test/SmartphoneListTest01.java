package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("7089A","Pixel");
        Smartphone s3 = new Smartphone("12346","Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3); // mudando posição do array

        for(Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("7089A", "Pixel");
        System.out.println(s2 == s4); //retorna falso pq ta errado
        System.out.println(smartphones.contains(s2));

        int indexSmartphoneS4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphoneS4);
        System.out.println(smartphones.get(indexSmartphoneS4));

    }
}
