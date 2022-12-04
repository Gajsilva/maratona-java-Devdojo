package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.service.BarcoRentalService;
import academy.devdojo.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.busacarCarroDisponivel();
        System.out.println("Usando carro por um mês");
        carroRentavelService.retornaCarroAlugado(carro);

        System.out.println("---------------------------------");

        BarcoRentalService barcoRentalService = new BarcoRentalService();
        Barco barco = barcoRentalService.busacarBarcoDisponivel();
        System.out.println("Usando barco por um mês");
        barcoRentalService.retornaBarcoAlugado(barco);
    }
}
