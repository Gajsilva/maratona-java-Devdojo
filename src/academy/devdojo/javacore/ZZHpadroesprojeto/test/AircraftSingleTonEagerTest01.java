package academy.devdojo.javacore.ZZHpadroesprojeto.test;

import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.AirCraftSingletonEager;

public class AircraftSingleTonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1C");
    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEager.getInstance());
        AirCraftSingletonEager aircraft = AirCraftSingletonEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
