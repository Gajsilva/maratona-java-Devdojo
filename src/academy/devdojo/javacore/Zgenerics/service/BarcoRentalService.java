package academy.devdojo.javacore.Zgenerics.service;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco busacarBarcoDisponivel(){
        System.out.println("Buscando barcos disponivel");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }
    public void retornaBarcoAlugado(Barco barco){
        System.out.println("Devolvenndo barco "+barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);;
    }
}
