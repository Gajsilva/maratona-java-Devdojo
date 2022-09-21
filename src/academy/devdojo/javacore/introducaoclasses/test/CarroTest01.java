package academy.devdojo.javacore.introducaoclasses.test;

import academy.devdojo.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Cherina";
        carro.modelo = "chevetão";
        carro.ano = 1980;

        carro2.nome = "Turbininha";
        carro2.modelo = "opala";
        carro2.ano = 1985;

        System.out.println(carro.nome +" ,qual modelo: "+carro.modelo+" ,qual" +
                " " +
                "ano: "+carro.ano);
        System.out.println("-----------------");

        System.out.println(carro2.nome +" ,qual modelo: "+carro2.modelo+" " +
                ",qual ano: " +
                " "+carro2.ano);
    }
}
