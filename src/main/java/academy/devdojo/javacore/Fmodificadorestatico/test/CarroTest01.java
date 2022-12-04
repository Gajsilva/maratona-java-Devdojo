package academy.devdojo.javacore.Fmodificadorestatico.test;

import academy.devdojo.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.velocidadeLimite = 180;

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Subaru", 260);
        Carro c3 = new Carro("Opala", 240);

        System.out.println(Carro.velocidadeLimite);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
