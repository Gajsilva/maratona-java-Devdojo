package academy.devdojo.javacore.ZZHpadroesprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletoEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AircraftSingletoEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
