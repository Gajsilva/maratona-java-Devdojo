package academy.devdojo.javacore.ZZHpadroesprojeto.test;

import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.AirCraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingleTonLazyTest01 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1C");
        System.out.println(AirCraftSingletonLazy.getInstance());
        System.out.println(AirCraftSingletonLazy.getInstance());

        Constructor<AirCraftSingletonLazy> constructors = AirCraftSingletonLazy.class.getDeclaredConstructors(String.class);
        constructors.setAccessible(true);
        AirCraftSingletonLazy airCraftSingletonLazy = constructors.newInstance("787-900");
        System.out.println(airCraftSingletonLazy);
    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonLazy.getInstance());
        AirCraftSingletonLazy aircraft = AirCraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
