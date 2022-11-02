package academy.devdojo.javacore.Zgenerics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
      //  animals[1]= new Gato();
    }
}
