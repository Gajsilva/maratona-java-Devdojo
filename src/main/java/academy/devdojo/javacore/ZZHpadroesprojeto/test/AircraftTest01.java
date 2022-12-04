package academy.devdojo.javacore.ZZHpadroesprojeto.test;

import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1a");
    }

    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft();
        System.out.println(aircraft);
    }
}
