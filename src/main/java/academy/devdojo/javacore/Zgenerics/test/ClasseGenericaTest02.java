package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.service.BarcoRentalService;
import academy.devdojo.javacore.Zgenerics.service.CarroRentavelService;
import academy.devdojo.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Fusca"), new Carro("Porshe")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Iate")));
        RentalService<Carro> rentalService1 = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService1.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês");
        rentalService1.retornaObjetoAlugado(carro);

        System.out.println("--------------------------------------");

        RentalService<Barco> rentalService = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mês");
        rentalService.retornaObjetoAlugado(barco);
    }
}
