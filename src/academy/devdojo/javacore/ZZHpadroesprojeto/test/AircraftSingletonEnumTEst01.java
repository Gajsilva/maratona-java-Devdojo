package academy.devdojo.javacore.ZZHpadroesprojeto.test;

import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.AircraftSingletoEnum;

public class AircraftSingletonEnumTEst01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletoEnum.INSTANCE);
        AircraftSingletoEnum aircraft = AircraftSingletoEnum.INSTANCE;
        System.out.println(aircraft.bookSeat(seat));

    }
}
